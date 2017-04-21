package com.myclasses;

/**
 * Created by DANCO on 30/03/2017.
 */
@Types(Types.Type.OnDanLoad)
public class OnDanLoad {
    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    String ss;
    public String dan() {
        return null;
    }
}

