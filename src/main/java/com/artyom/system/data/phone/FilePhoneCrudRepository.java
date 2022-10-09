package com.artyom.system.data.phone;

import com.artyom.system.file.AbstractFileCrudRepository;
import com.artyom.system.model.phone.PhoneModel;
import com.artyom.system.model.phone.PhoneNumberId;
import com.artyom.system.model.phone.PhoneNumberString;
import com.artyom.system.model.user.UserFileId;
import com.artyom.system.service.phone.PhoneStorage;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public class FilePhoneCrudRepository extends AbstractFileCrudRepository<PhoneModel, PhoneNumberId>
        implements PhoneStorage {

    private final PhoneCrudRepository phoneRepository;

    public FilePhoneCrudRepository(PhoneCrudRepository phoneRepository, Class<PhoneModel> phoneModelClass) {
        super(phoneModelClass);
        this.phoneRepository = phoneRepository;
    }

    @Override
    public PhoneNumberId add(String number) {
        var phone = mapOfSrc(number);
        var entity = new PhoneModel(phone, phone.toString());

        return phoneRepository.save(entity);
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

    public PhoneNumberId getNextId() {
        var ids = phoneRepository.fetchAll()
                .stream().map(PhoneModel::getId).sorted().toList();

        var lastId = ids.get(ids.size()-1);

        return PhoneNumberId.of(PhoneNumberString.
                parseToLong(Long.parseLong(String.valueOf(lastId)) + 2907));
    }

    @Override
    protected PhoneNumberId mapOfSrc(Object src) {
        return PhoneNumberId.of(src);
    }
}
