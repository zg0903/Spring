package com.itzg.createModule.Singleton.impl;

public class Singletion {
    private static Singletion instance = null;

    private Singletion() {
    }

    private static class SinletonFactory {
        private static Singletion instance = new Singletion();
    }

    public static Singletion getInstance() {

        return SinletonFactory.instance;
    }

}
