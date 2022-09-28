package system.service;

import system.dao.PhoneRepositoryImp;
import system.model.Phone;

import java.util.List;

public interface PhoneStorageImp extends PhoneRepositoryImp {

    @Override
    Phone save(Phone phone);

    @Override
    Phone update(Long id, Phone phone);

    @Override
    Long findById(Long id);

    @Override
    List<Phone> findAll();

    @Override
    boolean removeById(Long id);
}
