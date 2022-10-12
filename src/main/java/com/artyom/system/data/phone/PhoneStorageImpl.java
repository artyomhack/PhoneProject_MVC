package com.artyom.system.data.phone;

import com.artyom.system.model.phone.PhoneModel;
import com.artyom.system.model.phone.PhoneNumberId;
import com.artyom.system.model.user.UserFileId;
import com.artyom.system.service.phone.PhoneStorage;

import java.util.List;
import java.util.Objects;

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
        var phone = phoneRepository.fetchById(phoneId);

        if (!Objects.equals(phone.getNumberOfPhone(), number)) {
            phone = new PhoneModel(
                    phoneId,
                    number,
                    phoneRepository.fetchById(phoneId).getUser()
            );
        }
        return phoneRepository.save(phone);
    }

    @Override
    public List<PhoneModel> findAll() {
        return phoneRepository.fetchAll()
                .stream()
                .map(PhoneModel::getId)
                .filter(Objects::nonNull)
                .sorted()
                .map(phoneRepository::fetchById)
                .toList();
    }

    @Override
    public PhoneModel findById(PhoneNumberId phoneId) {
        return phoneRepository.fetchById(phoneId);
    }

    @Override
    public PhoneModel findByUser(UserFileId userId) {
        return null;
    }

    @Override
    public boolean deleteById(PhoneNumberId numberId) {
        return phoneRepository.removeById(numberId);
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
