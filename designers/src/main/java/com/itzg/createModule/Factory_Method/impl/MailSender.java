package com.itzg.createModule.Factory_Method.impl;

import com.itzg.createModule.Factory_Method.dao.sender;

public class MailSender implements sender {

    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }

    @Override
    public void OutTime() {
        System.out.println("超时！未发送");
    }
}
