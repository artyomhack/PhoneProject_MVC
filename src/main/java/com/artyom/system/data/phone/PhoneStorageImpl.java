package com.artyom.system.data.phone;

import com.artyom.system.model.phone.PhoneModel;
import com.artyom.system.model.phone.PhoneNumberId;
import com.artyom.system.model.user.UserFileId;
import com.artyom.system.service.phone.PhoneStorage;

import java.util.List;

public class PhoneStorageImpl implements PhoneStorage {

    private final PhoneCrudRepository phoneRepository;

    public PhoneStorageImpl(PhoneCrudRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @Override
    public PhoneNumberId add(String number) {
        return phoneRepository.save(
                new PhoneModel(PhoneNumberId.of(number), number)
        );
    }

    @Override
    public PhoneNumberId update(PhoneNumberId phoneId, String number) {
        return null;
    }

    @Override
    public List<PhoneModel> findAll() {
        return null;
    }

    @Override
    public PhoneModel findById(PhoneNumberId phoneId) {
        return null;
    }

    @Override
    public PhoneModel findByUser(UserFileId userId) {
        return null;
    }

    @Override
    public boolean deleteById(PhoneNumberId numberId) {
        return false;
    }

    @Override
    public boolean deleteUserIdByPhoneId(PhoneNumberId phoneId) {
        return false;
    }

    @Override
    public boolean deleteByUserId(UserFileId userId) {
        return false;
    }
}
