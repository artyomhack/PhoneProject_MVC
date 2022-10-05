package system.file;

import org.springframework.stereotype.Repository;
import system.model.phone.PhoneModel;
import system.model.phone.PhoneNumberId;
import system.model.phone.PhoneNumberString;

import java.util.List;

public interface DataFileRepositoryImp<T, ID>{

    ID save(T entity);

    List<T> fetchAll();

    T fetchById(ID id);

    ID getLastId();

    ID getNextId();
}
