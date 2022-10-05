package system.service.phone;

import system.data.phone.FilePhoneRepository;
import system.model.phone.PhoneModel;
import system.model.phone.PhoneNumberId;
import system.model.user.UserFileId;

import java.util.List;

public class PhoneStorageImpl implements PhoneStorage{

    private final FilePhoneRepository filePhoneRepository;

    public PhoneStorageImpl(FilePhoneRepository filePhoneRepository) {
        this.filePhoneRepository = filePhoneRepository;
    }


    @Override
    public PhoneNumberId add(String number) {
        var phone = PhoneDetails.of(number);

        return filePhoneRepository.save(PhoneModel.modelOf(phone));
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
