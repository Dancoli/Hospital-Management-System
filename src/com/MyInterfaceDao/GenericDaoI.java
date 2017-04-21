package com.MyInterfaceDao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by DANCO on 19/04/2017.
 */
public interface GenericDaoI<T, PK extends Serializable> {
    T save(T t);

    T findById(PK id);

    T merge(T t);

    List<T> findAll();

    boolean remove(T t);
}
