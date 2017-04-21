package com.MyEjbs;
import com.ClinicInterfaces.NurseI;
import com.MyClassDao.NurseDao;
import com.myclasses.Patient;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by DANCO on 20/04/2017.
 */
@Stateless
public class NurseEjb implements NurseI {
    @PersistenceContext(unitName = "dan")
    EntityManager em;
    @Override
    public List<Patient> viewPatientsData() {
        NurseDao n = new NurseDao(em);
       return n.findAll();
    }
}
