package org.home.NodeTest;

public class Nodedel {
    private Node next;
    private Node prv;
    private int size;
    //链表头
    public Node head;
    //链表尾
    public Node tail;

    private class Node {
        private Object data;
        private Node next;
        private Node prv;

        public Node(Object data) {
            this.data = data;
        }
    }

    public Nodedel() {
        size = 0;
        head = null;
        tail = null;
    }

    //尾部增加
    public void addnode(Object data) {
        Node node = new Node(data);
        if (size == 0) {
            head = node;
            tail = node;
            size++;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    //删除
    public boolean delNode(Object data) {
        Node node = new Node(data);
        if (size == 0) {
            return false;
        }
        if (head.next == tail.next) {
            head=null;
            tail=null;
            return true;
        }


        return true;

    }
}
