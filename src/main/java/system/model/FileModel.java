package system.model;

import com.sun.xml.bind.v2.model.core.ID;

public interface FileModel<ID extends FileId<?>>{
    ID getId();
}
