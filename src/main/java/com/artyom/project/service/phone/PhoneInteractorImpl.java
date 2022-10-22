package com.artyom.project.service.phone;

import com.artyom.project.model.phone.PhoneModel;
import com.artyom.project.model.phone.PhoneNumberId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneInteractorImpl implements PhoneInteractor {

    @Autowired
    private final PhoneStorage storage;

    public PhoneInteractorImpl(PhoneStorage storage) {
        this.storage = storage;
    }

    @Override
    public PhoneNumberId add(PhoneDetails phone) {
        return storage.save(PhoneModel.modelOf(phone));
    }

    @Override
    public PhoneDetails update(PhoneNumberId id, PhoneDetails phoneDetails) {
        return null;
    }

    @Override
    public PhoneDetails fetchById(PhoneNumberId id) {
        var entity = storage.findById(id);
        return PhoneDetails.of(entity.getNumberOfPhone());
    }

    @Override
    public List<PhoneDetails> fetchAll() {
        return null;
    }

    @Override
    public boolean removeById(PhoneNumberId id) {
        return false;
    }
}
