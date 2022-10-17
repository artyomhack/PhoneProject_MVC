package com.artyom.system.service.phone;

import com.artyom.system.model.phone.PhoneModel;
import com.artyom.system.model.phone.PhoneNumberId;
import com.artyom.system.service.user.UserDetails;
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
        var phone = storage.findById(id);
        var phoneDetails =
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
