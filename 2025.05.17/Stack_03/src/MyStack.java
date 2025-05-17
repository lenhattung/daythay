
import java.util.EmptyStackException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tungi
 */
public class MyStack {

    Node top;

    public MyStack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(Object b) {
        Node newNode = new Node(b);
        newNode.next = top;
        top = newNode;
    }

    public Object pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Object value = top.info;
        top = top.next;
        return value;
    }

    public Object peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.info;
    }

    public void display() {
        Node p = top;
        while (p != null) {
            System.out.println(p.info);
            p = p.next;
        }
    }
}
