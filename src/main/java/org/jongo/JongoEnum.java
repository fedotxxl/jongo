/*
 * JongoEnum
 * Copyright (c) 2012 Cybervision. All rights reserved.
 */
package org.jongo;

import com.fasterxml.jackson.annotation.JsonValue;

public interface JongoEnum {

    @JsonValue
    public int toStored();

}
