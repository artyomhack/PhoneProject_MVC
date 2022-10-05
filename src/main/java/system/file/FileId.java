package system.file;

import com.sun.xml.bind.v2.model.core.ID;
import system.model.Value;

public interface FileId<T> extends Value<T> {
    boolean isEmpty();
}
