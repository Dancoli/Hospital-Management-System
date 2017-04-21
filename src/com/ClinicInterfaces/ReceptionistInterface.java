package com.ClinicInterfaces;

import com.myclasses.Patient;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by DANCO on 10/04/2017.
 */
@Local
public interface ReceptionistInterface {

    List<Patient> viewPatientsData();
    Boolean insertData(Patient patient);

}