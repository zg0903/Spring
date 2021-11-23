package com.itzg.createModule.Singleton.impl;

public class Singletion_4 {
    private static final Singletion_4 instance = new Singletion_4();

    private Singletion_4() {
    }

    public static Singletion_4 getInstance() {
        return instance;
    }
}
