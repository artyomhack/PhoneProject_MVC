package com.artyom.project.model.user;

import com.artyom.project.file.FileModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Setter
@Getter
public class UserModel implements FileModel<UserFileId> {

    private final UserFileId userId;
    private String firstName;
    private String lastName;
    private String phonetic; //middleName

    @Override
    public UserFileId getId() {
        return null;
    }
}
