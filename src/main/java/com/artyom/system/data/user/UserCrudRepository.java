package com.artyom.system.data.user;

import com.artyom.system.file.FileCrudRepository;
import com.artyom.system.model.user.UserFileId;
import com.artyom.system.model.user.UserModel;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCrudRepository extends FileCrudRepository<UserModel, UserFileId> {
}
