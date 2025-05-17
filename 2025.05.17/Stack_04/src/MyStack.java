
import java.util.EmptyStackException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class MyStack<T> {
    Node top;

    public MyStack() {
        top = null;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    
    public void push(T obj){
        Node newNode = new Node<T>(obj);
        newNode.next = top;
        top = newNode;
    }
    public T pop() throws EmptyStackException{
         if (isEmpty()) {
            throw new EmptyStackException();
        }
         
        T value = (T) top.info;
        top = top.next;
        return value;
    }
    public T peek() throws EmptyStackException{
         if (isEmpty()) {
            throw new EmptyStackException();
        }
         
        T value = (T) top.info;
        return value;
    }
}
