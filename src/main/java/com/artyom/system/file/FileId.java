package com.artyom.system.file;

import com.artyom.system.model.Value;

public interface FileId<T> extends Value<T> {
    boolean isEmpty();
}
