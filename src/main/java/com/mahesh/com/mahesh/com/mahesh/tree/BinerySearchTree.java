package com.mahesh.com.mahesh.com.mahesh.tree;


/*
Author: Mahesh Pununupati
*/


public class BinerySearchTree {
    static class Node{
        int data;
        Node left, right;
        Node(int d){
            data = d;
            left = null;
            right = null;
        }
    }
    Node root;
    public void insert(int d){
        Node temp = new Node(d);
        if(this.root ==null) {
            this.root = temp;
            return;
        }
        Node root = this.root;
        Node temp2 = root;
        while (root !=null){
            temp2 = root;
            if(root.data<temp.data)
                root = root.right;
            else if(root.data> temp.data)
                root = root.left;
        }
        if(temp2.data<temp.data)
            temp2.right = temp;
        if(temp2.data>temp.data)
            temp2.left = temp;
    }
    public void inorder(Node node){
        if(node==null)
            return;
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }
    public static void main(String arg[]){
        BinerySearchTree binerySearchTree = new BinerySearchTree();
        binerySearchTree.insert(4);
        binerySearchTree.insert(5);
        binerySearchTree.insert(6);
        binerySearchTree.insert(3);
        binerySearchTree.inorder(binerySearchTree.root);
    }
}
