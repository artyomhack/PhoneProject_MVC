package com.artyom.project.data.user;

import com.artyom.project.file.FileCrudRepository;
import com.artyom.project.model.user.UserFileId;
import com.artyom.project.model.user.UserModel;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCrudRepository extends FileCrudRepository<UserModel, UserFileId> {
}
