package system.file;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import system.model.FileId;
import system.model.FileModel;

import java.io.*;
import java.util.*;

public abstract class AbstractFileRepository<T extends FileModel<ID>, ID extends FileId<?>>
        implements DataFileRepositoryImp<T, ID> {

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
            getObjectMapper().writeValue(saveFileJson(), entity);
            return id;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<T> fetchAll() {
        var files = saveFileJson().listFiles();
        if (Objects.nonNull(files) && files.length > 0) {
            return Arrays.stream(files)
                    .map(this::readFile)
                    .filter(Objects::nonNull)
                    .sorted()
                    .toList();
        }
        return Collections.emptyList();

    }

    @Override
    public T fetchById(ID id) {
        if (!id.isEmpty()) {
            var file = getFileById(id);
            return readFile(file);

        } else return null;
    }

    private ObjectWriter getObjectMapper() {
        return new ObjectMapper().writerWithDefaultPrettyPrinter();
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

    @Override
    public ID getLastId() {
        var ids = fetchAll().stream().map(this::mapOfSrc).toList();

        return mapOfSrc(ids.get(ids.size() - 1));
    }

    private File saveFileJson() {
        return new File(filePath);
    }

    private File getFileById(ID id) {
        if (filePath.endsWith(id.toString() + ".json"))
            return new File(filePath);
        else return null;
    }

    abstract protected ID mapOfSrc(Object src);
}
