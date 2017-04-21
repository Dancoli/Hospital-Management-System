package com.MyEjbs;

import com.ClinicInterfaces.DoctorI;
import com.MyClassDao.DoctorDao;
import com.myclasses.Patient;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by DANCO on 20/04/2017.
 */
@Stateless
public class PrescribeandDiagnosEjb implements DoctorI {
    @PersistenceContext(unitName = "dan")
    EntityManager em;
    @Override
    public Boolean updatePatient(Patient patient) {
        DoctorDao d = new DoctorDao(em);
        d.merge(patient);
        return null;
    }
}
