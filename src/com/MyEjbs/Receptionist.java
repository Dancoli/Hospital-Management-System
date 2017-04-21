package com.MyEjbs;

import com.ClinicInterfaces.ReceptionistInterface;
import com.MyClassDao.ReceptionistDao;
import com.myclasses.Patient;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by DANCO on 19/04/2017.
 */
@Stateless
public class Receptionist implements ReceptionistInterface {
    @PersistenceContext(unitName = "dan")
    EntityManager em;

    @Override
    public List<Patient> viewPatientsData() {
        return null;
    }

    @Override
    public Boolean insertData(Patient patient) {
        ReceptionistDao r = new ReceptionistDao(em);
        r.save(patient);
        return null;
    }

}
