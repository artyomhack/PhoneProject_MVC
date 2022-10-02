package system.file;

import system.model.phone.PhoneModel;
import system.model.phone.PhoneNumberId;
import system.model.phone.PhoneNumberString;

public class FilePhoneRepository extends AbstractFileRepository<PhoneModel, PhoneNumberId> {

    protected FilePhoneRepository(PhoneModel entity) {
        super(entity);
    }

    @Override
    protected PhoneNumberId mapOfSrc(Object src) {
        return new PhoneNumberId(src);
    }

    @Override
    public PhoneNumberId getNextId() {
        var ids = fetchAll()
                .stream().map(PhoneModel::getId).sorted().toList();

        var lastId = ids.get(ids.size()-1);

        return PhoneNumberId.of(PhoneNumberString.
                        parseToLong(Long.parseLong(String.valueOf(lastId)))
                );
    }
}
