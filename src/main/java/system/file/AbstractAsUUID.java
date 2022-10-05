package system.file;

import java.util.UUID;

public abstract class AbstractAsUUID implements FileId<UUID>{

    public static UUID valueUUID = new UUID(123456789L, System.currentTimeMillis());//UUID.parse();

    protected AbstractAsUUID(Object valueUUID) {
        AbstractAsUUID.valueUUID = (UUID) valueUUID;
    }

    public UUID getValueUUID() {
        return valueUUID;
    }

    @Override
    public UUID getValue() {
        return valueUUID;
    }

    @Override
    public boolean isEmpty() {
        return this.getValue() == valueUUID;
    }
}
