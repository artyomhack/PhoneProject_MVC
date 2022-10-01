package system.service;

import system.dao.PhoneRepository;
import system.model.phone.PhoneModel;

import java.util.List;

public class PhoneStorage implements PhoneStorageImp{

    private final PhoneRepository phoneRepository;

    public PhoneStorage(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @Override
    public PhoneModel save(PhoneModel phoneModel) {
        return null;
    }

    @Override
    public PhoneModel update(Long id, PhoneModel phoneModel) {
        return null;
    }

    @Override
    public Long findById(Long id) {
        return null;
    }

    @Override
    public List<PhoneModel> findAll() {
        return null;
    }

    @Override
    public boolean removeById(Long id) {
        return false;
    }
}
