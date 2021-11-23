package com.itzg.createModule.Factory_Method.factory;

import com.itzg.createModule.Factory_Method.dao.sender;
import com.itzg.createModule.Factory_Method.impl.SmsSender;

public class SendSmsFactory implements provider {
    @Override
    public sender produce() {
        return new SmsSender();
    }
}
