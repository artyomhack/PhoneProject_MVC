package system.file;

public interface FileModel<ID extends FileId<?>>{
    ID getId();
}
