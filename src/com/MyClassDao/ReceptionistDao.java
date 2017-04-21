package com.MyClassDao;

import com.myclasses.Patient;

import javax.persistence.EntityManager;

/**
 * Created by DANCO on 19/04/2017.
 */
public class ReceptionistDao extends GenericDao<Patient, Long> {
    public ReceptionistDao(EntityManager entityManager) {
        super(Patient.class, entityManager);
    }
}
