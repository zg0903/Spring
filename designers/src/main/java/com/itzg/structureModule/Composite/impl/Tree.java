package com.itzg.structureModule.Composite.impl;
//使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
public class Tree {
    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");
        b.add(c);
        tree.root.add(b);
        System.out.println("build the three finished!");

    }

}
