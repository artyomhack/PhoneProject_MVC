package system.file;

import java.util.List;

public interface DataFileRepositoryImp<T, ID>{

    ID save(T entity);

    List<T> fetchAll();

    ID getLastId();

    ID getNextId();
}
