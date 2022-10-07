package com.artyom.system.data.phone;

import com.artyom.system.file.AbstractFileRepository;
import com.artyom.system.file.DataFileRepositoryImp;
import com.artyom.system.model.phone.PhoneModel;
import com.artyom.system.model.phone.PhoneNumberId;
import com.artyom.system.model.phone.PhoneNumberString;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilePhoneRepository implements DataFileRepositoryImp<PhoneModel, PhoneNumberId> {

    private final AbstractFileRepository<PhoneModel, PhoneNumberId> repository;

    public FilePhoneRepository(AbstractFileRepository<PhoneModel, PhoneNumberId> repository) {
        this.repository = repository;
    }

    @Override
    public PhoneNumberId save(PhoneModel entity) {
        return repository.save(entity);
    }

    @Override
    public List<PhoneModel> fetchAll() {
        return repository.fetchAll();
    }

    @Override
    public PhoneModel fetchById(PhoneNumberId phoneNumberId) {
        return repository.fetchById(phoneNumberId);
    }

    @Override
    public PhoneNumberId getLastId() {
        return repository.getLastId();
    }

    @Override
    public PhoneNumberId getNextId() {
        var ids = fetchAll()
                .stream().map(PhoneModel::getId).sorted().toList();

        var lastId = ids.get(ids.size()-1);

        return PhoneNumberId.of(PhoneNumberString.
                parseToLong(Long.parseLong(String.valueOf(lastId)) + 2907));
    }
}