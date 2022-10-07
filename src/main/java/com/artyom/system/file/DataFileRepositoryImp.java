package com.artyom.system.file;

import java.util.List;

public interface DataFileRepositoryImp<T, ID>{

    ID save(T entity);

    List<T> fetchAll();

    T fetchById(ID id);

    ID getLastId();

    ID getNextId();
}
