/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondlist_stack;

/**
 *
 * @author jit
 * @param <E>
 */
public class Queue<E> {

    CustomLinkedList<E> list = new CustomLinkedList<>();

    public void DeQueue() {
        list.removeHead();
    }

    public void EnQueue(E obj) {
        list.addAtTail(obj);
    }

    public int size() {
        return list.size();
    }

    public Object get(int index) {
        return list.get(index).data;
    }
}
