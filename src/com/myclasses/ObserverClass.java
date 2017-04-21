package com.myclasses;

import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;

/**
 * Created by DANCO on 29/03/2017.
 */

public class ObserverClass {
    public void Observe(@Observes(notifyObserver = Reception.ALWAYS) OnpageLoad onpageLoad){

        onpageLoad.setMes("ÖLOO");

        onpageLoad.getMes();

        onpageLoad.dan();
System.out.println(onpageLoad.getMes());
    }
    public void fff(@Observes(notifyObserver =Reception.ALWAYS) OnDanLoad onDanLoad){
        onDanLoad.setSs("youuuuu");
        onDanLoad.getSs();
        System.out.println(onDanLoad.getSs());
    }
}
