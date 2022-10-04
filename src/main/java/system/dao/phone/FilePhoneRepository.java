package system.dao.phone;

import system.file.AbstractFileRepository;
import system.file.DataFileRepositoryImp;
import system.model.phone.PhoneModel;
import system.model.phone.PhoneNumberId;
import system.model.phone.PhoneNumberString;

import java.util.List;

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
