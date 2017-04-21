package com.myclasses;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * Created by DANCO on 29/03/2017.
 */
@Qualifier
@Retention(RetentionPolicy.CLASS)
@Target({FIELD,PARAMETER,METHOD,TYPE})
public @ interface SelectionInterface {
    public enum Type{
        ORACLE,
        MYSQL,

    }
    Type value();
}

