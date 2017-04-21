package com.myclasses;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DANCO on 10/04/2017.
 */
public class TrialData {

    public List TrialEmployeeData(){
        Patient p = new Patient();
        p.setDetails(234,"DANCUN",25,"18/03/1992","0713378461","simiyudan@gmail.com","MALE");
        List <Patient> list = new ArrayList<Patient>();
        list.add(p);
        return list;
    }
}
