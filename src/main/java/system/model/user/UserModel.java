package system.model.user;

import system.file.FileModel;

public class UserModel implements FileModel<UserFileId> {

    private final UserFileId userId;
    private String firstName;
    private String lastName;
    private String phonetic; //middleName

    public UserModel(UserFileId userId, String firstName, String lastName, String phonetic) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phonetic = phonetic;
    }

    @Override
    public UserFileId getId() {
        return null;
    }
}
