package com.itzg.createModule.Singleton.impl;

public class Singletion_3 {
    private static Singletion_3 instance = null;

    private Singletion_3() {
    }

    private static synchronized void sncInit() {
        if (instance == null) {
            instance = new Singletion_3();
        }
    }

    public static Singletion_3 getInstance() {
        if (instance == null) {
            sncInit();
        }
        return instance;
    }


}
