package com.mahesh.tree;


/*
Author: Mahesh Punugupati
*/


public class DelateBST {
    Node root;

    public static void main(String arg[]) {
        DelateBST delateBST = new DelateBST();
        delateBST.insert(50);
        delateBST.insert(30);
        delateBST.insert(20);
        delateBST.insert(40);
        delateBST.insert(70);
        delateBST.insert(60);
        delateBST.insert(80);
//        delateBST.inorder(delateBST.root);
        delateBST.preOrder(delateBST.root);
        delateBST.delete(50);
        System.out.println("----------");
        delateBST.preOrder(delateBST.root);
    }

    public void insert(int d) {
        Node temp = new Node(d);
        if (this.root == null) {
            this.root = temp;
            return;
        }
        Node root = this.root;
        Node temp2 = root;
        while (root != null) {
            temp2 = root;
            if (root.data < temp.data)
                root = root.right;
            else if (root.data > temp.data)
                root = root.left;
        }
        if (temp2.data < temp.data)
            temp2.right = temp;
        if (temp2.data > temp.data)
            temp2.left = temp;
    }

    public void preOrder(Node root) {
        if (root == null)
            return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }

    public Node findMin(Node root) {
        if (root.left == null)
            return root;
        return findMin(root.left);
    }

    public void delete(int i) {
        deleteNode(root, i);
    }

    public Node deleteNode(Node node, int i) {
        if (node == null)
            return null;
        if (node.data > i) {
            node.left = deleteNode(node.left, i);
        } else if (node.data < i) {
            node.right = deleteNode(node.right, i);
        } else {
            if (node.left == null && node.right == null)
                return null;
            if (node.left == null)
                return node.right;
            else if (node.right == null) {
                return node.left;
            } else {
                int min = findMin(node.right).data;
                node.data = min;
                node.right = deleteNode(node.right, min);
            }

        }
        return node;
    }

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }
}
