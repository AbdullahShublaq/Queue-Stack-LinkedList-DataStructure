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
public class Node<E> {
    E data;
    Node next;

    @Override
    public String toString() {
        return data.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Node(E data){
        this.data=data;
    }

    public E getData() {
        return data;
    }
    public void setData(E data) {
        this.data = data;
    }
}
