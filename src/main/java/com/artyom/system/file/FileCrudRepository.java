package com.artyom.system.file;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileCrudRepository<T, ID>{

    ID save(T entity);

    List<T> fetchAll();

    T fetchById(ID id);

    ID getLastId();

    ID getNextId();
}
