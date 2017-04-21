package com.ClinicInterfaces;

import com.myclasses.Patient;

import javax.ejb.Local;

/**
 * Created by DANCO on 20/04/2017.
 */
@Local
public interface DoctorI {
    Boolean updatePatient(Patient patient);
}
