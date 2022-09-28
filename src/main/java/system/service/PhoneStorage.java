package system.service;

import system.dao.PhoneRepository;
import system.model.Phone;

import java.util.List;

public class PhoneStorage implements PhoneStorageImp{

    private final PhoneRepository phoneRepository;

    public PhoneStorage(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @Override
    public Phone save(Phone phone) {
        return null;
    }

    @Override
    public Phone update(Long id, Phone phone) {
        return null;
    }

    @Override
    public Long findById(Long id) {
        return null;
    }

    @Override
    public List<Phone> findAll() {
        return null;
    }

    @Override
    public boolean removeById(Long id) {
        return false;
    }
}
