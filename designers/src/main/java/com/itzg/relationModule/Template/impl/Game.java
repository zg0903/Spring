package com.itzg.relationModule.Template.impl;

public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //    模板
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

}
