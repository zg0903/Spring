package com.itzg.createModule.Singleton.impl;

public class Singletion_1 {
    private static Singletion_1 instance = null;

    private Singletion_1() {
    }

    public static Singletion_1 getInstance() {
        if (instance == null) {
            instance = new Singletion_1();
        }
        return instance;
    }

}
