package com.itzg.structureModule.Facade.Impl;

public class Conputer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Conputer() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup(){
        System.out.println("start the computer");
        cpu.startup();
        memory.startp();
        disk.startp();
        System.out.println("start computer finished!");
    }
    public void shutdown(){
        System.out.println("finshe the computer");
        cpu.shuddwon();
        memory.shutdown();
        disk.shutdown();
        System.out.println("close the computer");


    }


}
