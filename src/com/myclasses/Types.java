package com.myclasses;


import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * Created by DANCO on 30/03/2017.
 */
@Qualifier
        @Retention(RetentionPolicy.CLASS)
        @Target({PARAMETER,FIELD, METHOD, TYPE })
public @ interface Types {
    public enum  Type{
        OnDanLoad,
        OnpageLoad,
    }
    Type value();
}
