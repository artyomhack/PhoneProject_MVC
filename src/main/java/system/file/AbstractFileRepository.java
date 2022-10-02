package system.file;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import system.model.FileId;
import system.model.FileModel;

import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public abstract class AbstractFileRepository<T extends FileModel<ID>, ID extends FileId<?>>
        implements DataFileRepositoryImp<T, ID>{

    private final static String path = ".json";
    private final String filePath;

    protected AbstractFileRepository(T entity) {
        this.filePath = "C:\\__work\\project\\CrossZeroMVC\\jsonFiles" + File.separator + entity.getClass().getSimpleName() +
                File.separator + entity.getId() + path;
    }

    public ID save(T entity) {
        var id = entity.getId();

        if (id.isEmpty()) {
            id = getNextId();
        }

        try {
            getObjectMapper().writeValue(getFileJson(), entity);
            return id;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<T> fetchAll() {
        var files = getFileJson().listFiles();
        if (Objects.nonNull(files) && files.length > 0) {
            return Arrays.stream(files)
                    .map(this::readFile)
                    .filter(Objects::nonNull)
                    .sorted()
                    .toList();
        }
        return Collections.emptyList();

    }

    private ObjectWriter getObjectMapper() {
        return  new ObjectMapper().writerWithDefaultPrettyPrinter();
    }

    private T readFile(File file) {
        try {
            var stream = new ObjectInputStream(new FileInputStream(file));
            var entity = (T) stream.readObject();
            stream.close();
            return entity;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private File getFileJson() {
        return new File(filePath);
    }

    @Override
    public ID getLastId() {
        var ids = fetchAll().stream().map(this::mapOfSrc).toList();

        return mapOfSrc(ids.get(ids.size() - 1));
    }

    abstract protected ID mapOfSrc(Object src);
}
