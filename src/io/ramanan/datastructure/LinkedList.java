package io.ramanan.datastructure;

public class LinkedList<E> {

    public int size;
    public Node<E> first;
    public Node<E> last;

    public static class Node<E> {
        public E element;
        public Node<E> next;
    }

    public void add(final E value) {
        final Node<E> node = new Node<>();
        node.element = value;

        if (first == null) {
            this.first = node;
        }

        if (last == null) {
            this.last = node;
        } else {
            last.next = node;
            this.last = node;
        }
        size++;
    }

    public E pop(){
        if(first == null){
            return null;
        }
        E element = first.element;
        first = first.next;
        size--;
        return element;
    }

    public E peek(){
        if(first != null){
            return first.element;
        }
        return null;
    }

    public void addFirst(E value){
        Node<E> node = new Node<>();
        node.element = value;
        node.next = first;
        first = node;
        size++;
    }

    public void printSize(){
        System.out.println(size);;
    }

    public void print() {
        var node = first;
        System.out.println("~~~~~~~~~~~~~`");
        while (node != null) {
            System.out.println(node.element);
            node = node.next;
        }
        System.out.println("~~~~~~~~~~~~~`");
    }

    public static void main(final String[] args) {
        final LinkedList<String> list = new LinkedList<>();
        list.add("Dhanam");
        list.add("Ramanan");
        list.print();
        list.printSize();
        list.pop();
        list.addFirst("Induja");
        list.add("Niralya");
        list.add("Navira");
        list.print();
        list.printSize();
    }
}