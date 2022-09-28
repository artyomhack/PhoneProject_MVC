package system.dao;

import system.file.FileRepository;
import system.model.Phone;

import java.util.List;

public interface PhoneRepositoryImp<T,ID>  {

    Phone save(Phone phone);

    Phone update(Long id, Phone phone);

    Long findById(Long id);

    List<Phone> findAll();

    boolean removeById(Long id);
}
