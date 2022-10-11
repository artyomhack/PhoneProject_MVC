package com.artyom.system.data.phone;

import com.artyom.system.file.AbstractFileCrudRepository;
import com.artyom.system.model.phone.PhoneModel;
import com.artyom.system.model.phone.PhoneNumberId;

import java.util.List;

public class PhoneCrudRepositoryImpl extends AbstractFileCrudRepository<PhoneModel, PhoneNumberId>
        implements PhoneCrudRepository{

    public PhoneCrudRepositoryImpl() {
        super(PhoneModel.class);
    }

    @Override
    public PhoneNumberId save(PhoneModel entity) {
        return super.save(entity);
    }

    @Override
    public List<PhoneModel> fetchAll() {
        return super.fetchAll();
    }

    @Override
    public PhoneModel fetchById(PhoneNumberId phoneNumberId) {
        return super.fetchById(phoneNumberId);
    }

    @Override
    public PhoneNumberId getLastId() {
        return super.getLastId();
    }

    @Override
    public PhoneNumberId getNextId() {
        var ids = super.fetchAll()
                .stream().map(PhoneModel::getId).sorted().toList();
        var last = ids.get(ids.size()-1);

        return new PhoneNumberId(
                Long.parseLong(last.getValue().toString() + 2907)
        );
    }

    @Override
    protected PhoneNumberId mapOfSrc(Object src) {
        return null;
    }
}
