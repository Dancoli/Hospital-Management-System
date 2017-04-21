package com.MyEjbs;

import com.ClinicInterfaces.LabtechI;
import com.MyClassDao.LabtechDao;
import com.myclasses.Patient;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by DANCO on 20/04/2017.
 */
@Stateless
public class LabtechEjb implements LabtechI {
    @PersistenceContext(unitName = "dan")
    EntityManager em;
    @Override
    public Boolean updateDetails(Patient patient, int id) {
        LabtechDao l = new LabtechDao(em);
        l.merge(patient);
        return null;
    }
}
