package com.itzg.createModule.Singleton.impl;

public class Singletion_2 {
    private static Singletion_2 instance = null;

    private Singletion_2() {
    }

    public static Singletion_2 getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singletion_2();
                }
            }
        }
        return instance;
    }


}
