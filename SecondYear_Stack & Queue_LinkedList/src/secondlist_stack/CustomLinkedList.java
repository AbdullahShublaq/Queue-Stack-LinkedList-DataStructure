/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondlist_stack;

/**
 *
 * @author jit
 */
public class CustomLinkedList<E> {

    private int size = 0;
    private Node<E> head;
    private Node<E>/* E data*/ tail;

    public void addAtHead(E data) {
        if (empty()) {
            head = new Node(data);
            tail = head;
            //size++;
        } else {
            Node temp = head;
            head = new Node(data);
            head.next = temp;
            //size++;
        }
        size++;
    }

    public void addAtTail(E data) {
        if (empty()) {
            tail = new Node(data);
            head = tail;
        } else {
            /*tail.next=new Node(data);
              taia=tail.next;   */
            Node temp = tail;
            tail = new Node(data);
            temp.next = tail;
        }
        size++;
    }

    public void addAtIndex(int index, E data) {
        if (empty()) {
            addAtHead(data);
            size++;
        } else if (index == size - 1) {
            addAtTail(data);
            size++;
        } else {
            Node current = head;
            Node previous = null;
            for (int i = 0; i < size; i++) {
                if (i == index - 1) {
                    previous = current;
                }
                if (i == index) {
                    previous.next = new Node(data);
                    previous.next.next = current;
                    size++;
                    break;
                }
                current = current.next;
            }
        }
    }

    public void removeHead() {
        head = head.next;
        size--;
        if (size == 1) {
            tail = head;
        }
    }

    public void removeTail() {
        Node current = head;
        for (int i = 0; i <= size - 2; i++) {
            if (i == size - 2) {
                tail = current;
                tail.next = null;
                break;
            }
            current = current.next;
        }
        size--;
        if (size == 1) {
            head = tail;
        }
    }

    public void removeIndex(int index) {
        if (index == 0) {
            removeHead();          
        } else if (index == size - 1) {
            removeTail();          
        } else {
            Node current = head;
            Node previous;
            for (int i = 0; i < size; i++) {
                if (i == index - 1) {
                    previous = current;
                    previous.next = previous.next.next;
                    size--;
                    break;
                }
                current = current.next;
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        return (size == 0);
    }

    public Node<E> getHead() {
        return head;
    }

    public Node<E> getTail() {
        return tail;
    }
    
    public Node get(int index){
        Node current=head;
        for (int i = 0; i < size; i++) {
            if(i==index){
                break;
            }
            current=current.next;
        }
        return current;
    }

   
}
