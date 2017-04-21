package com.ClinicInterfaces;

import com.myclasses.Patient;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by DANCO on 20/04/2017.
 */
@Local
public interface NurseI {
    List<Patient> viewPatientsData();

}
