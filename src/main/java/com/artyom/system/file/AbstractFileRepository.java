package com.artyom.system.file;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.*;

@Repository
public abstract class AbstractFileRepository<T extends FileModel<ID>, ID extends FileId<?>>
        implements DataFileRepositoryImp<T, ID> {

    private final static String path = ".json";
    private final String filePath;

    protected AbstractFileRepository(Class<T> entity) {
        this.filePath = "C:\\__work\\project\\CrossZeroMVC\\jsonFiles" + File.separator
                + entity.getSimpleName() + "_id_" + path;
    }

    public ID save(T entity) {
        var id = entity.getId();

        if (id.isEmpty()) {
            id = getNextId();
        }
        var file = getFileById(id);
        try {
            getObjectMapper().writeValue(file, entity);
            return id;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<T> fetchAll() {
        var files = new File(filePath).listFiles();
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

    @Override
    public ID getLastId() {
        var ids = fetchAll().stream().map(this::mapOfSrc).toList();

        return mapOfSrc(ids.get(ids.size() - 1));
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

    private File getFileById(ID id) {
        return new File(filePath.replace("_id_", String.valueOf(id)));
    }

    abstract protected ID mapOfSrc(Object src);
}
