package system.data.user;

import org.springframework.stereotype.Repository;
import system.file.AbstractFileRepository;
import system.file.DataFileRepositoryImp;
import system.model.user.UserFileId;
import system.model.user.UserModel;

import java.util.List;

public class FileUserRepository implements DataFileRepositoryImp<UserModel, UserFileId> {

    private final AbstractFileRepository<UserModel, UserFileId> repository;

    public FileUserRepository(AbstractFileRepository<UserModel, UserFileId> repository) {
        this.repository = repository;
    }

    @Override
    public UserFileId save(UserModel entity) {
        return repository.save(entity);
    }

    @Override
    public List<UserModel> fetchAll() {
        return repository.fetchAll();
    }

    @Override
    public UserModel fetchById(UserFileId userFileId) {
        return repository.fetchById(userFileId);
    }

    @Override
    public UserFileId getLastId() {
        return repository.getLastId();
    }

    @Override
    public UserFileId getNextId() {
        var ids = repository.fetchAll().stream().
                map(UserModel::getId).sorted().toList();

        var last = ids.get(ids.size() - 1);

        return UserFileId.of(System.currentTimeMillis()
                + Long.parseLong(String.valueOf(last)));
    }
}
