package com.MyClassDao;

import com.myclasses.Patient;

import javax.persistence.EntityManager;

/**
 * Created by DANCO on 19/04/2017.
 */
public class LabtechDao extends GenericDao<Patient, Long> {
    public LabtechDao(EntityManager entityManager) {
        super(Patient.class, entityManager);
    }
}
