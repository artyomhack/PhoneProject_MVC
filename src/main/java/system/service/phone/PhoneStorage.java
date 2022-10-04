package system.service.phone;

import system.model.phone.PhoneModel;
import system.model.phone.PhoneNumberId;
import system.model.user.UserFileId;

import java.util.List;

public interface PhoneStorage {
    PhoneNumberId add(String number);

    PhoneNumberId update(PhoneNumberId phoneId, String number);

    List<PhoneModel> findAll();

    PhoneModel findById(PhoneNumberId phoneId);

    PhoneModel findByUser(UserFileId userId);

    boolean deleteById(PhoneNumberId numberId);

    boolean deleteUserIdByPhoneId(PhoneNumberId phoneId);

    boolean deleteByUserId(UserFileId userId);
}
