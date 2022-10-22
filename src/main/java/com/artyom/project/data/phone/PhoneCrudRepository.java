package com.artyom.project.data.phone;

import com.artyom.project.file.FileCrudRepository;
import com.artyom.project.model.phone.PhoneModel;
import com.artyom.project.model.phone.PhoneNumberId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneCrudRepository extends FileCrudRepository<PhoneModel, PhoneNumberId> {
}
