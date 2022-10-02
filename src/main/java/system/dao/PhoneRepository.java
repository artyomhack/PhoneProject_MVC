package system.dao;

import system.model.phone.PhoneModel;

import java.util.List;

public interface PhoneRepository <T,ID>  {

    PhoneModel save(PhoneModel phoneModel);

    PhoneModel update(Long id, PhoneModel phoneModel);

    Long findById(Long id);

    List<PhoneModel> findAll();

    boolean removeById(Long id);
}
