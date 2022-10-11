package com.artyom.system.data.phone;

import com.artyom.system.file.FileCrudRepository;
import com.artyom.system.model.phone.PhoneModel;
import com.artyom.system.model.phone.PhoneNumberId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneCrudRepository extends FileCrudRepository<PhoneModel, PhoneNumberId> {
}
