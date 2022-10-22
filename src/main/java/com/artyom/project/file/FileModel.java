package com.artyom.project.file;

public interface FileModel<ID extends FileId<?>>{
    ID getId();
}
