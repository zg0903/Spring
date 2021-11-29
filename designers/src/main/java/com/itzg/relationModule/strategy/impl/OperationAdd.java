package com.itzg.relationModule.strategy.impl;

import com.itzg.relationModule.strategy.dao.Strategy;

public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
