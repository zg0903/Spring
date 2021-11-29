package com.itzg.relationModule.strategy.impl;

import com.itzg.relationModule.strategy.dao.Strategy;
//策略模式的决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对各种算法做 封装。因此，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可。
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execiteStrategy(int n1, int n2) {
        return strategy.doOperation(n1, n2);
    }

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.execiteStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.execiteStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.execiteStrategy(10, 5));
    }
}
