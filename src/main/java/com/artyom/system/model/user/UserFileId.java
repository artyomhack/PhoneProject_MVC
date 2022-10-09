package com.artyom.system.model.user;

import com.artyom.system.file.AbstractAsUUID;
import com.artyom.system.file.FileId;
import lombok.Data;

import java.util.UUID;

public class UserFileId extends AbstractAsUUID implements FileId<UUID> {

    private final static UserFileId userId = new UserFileId(valueUUID);

    protected UserFileId(Object valueUUID) {
        super(valueUUID);
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public static UserFileId of(Object src) {
        return new UserFileId(
                new UUID(123456789, Long.parseLong(String.valueOf(src)))
        );
    }
}
