package system.service;

import system.dao.PhoneRepositoryImp;
import system.model.phone.PhoneModel;

import java.util.List;

public interface PhoneStorageImp extends PhoneRepositoryImp {

    @Override
    PhoneModel save(PhoneModel phoneModel);

    @Override
    PhoneModel update(Long id, PhoneModel phoneModel);

    @Override
    Long findById(Long id);

    @Override
    List<PhoneModel> findAll();

    @Override
    boolean removeById(Long id);
}
