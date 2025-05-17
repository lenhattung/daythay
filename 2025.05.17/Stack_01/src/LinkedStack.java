/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class LinkedStack {

    Node head;

    public LinkedStack() {
        head = null;
    }

    // isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    // push
    public void push(int x){
        //head = new Node(x, head);
       
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
    }
    
    // top // peek
    public int top(){
        return head.info;
    }
    
    // pop
    public int pop(){
        int value = head.info;
        head = head.next;
        return value;
    }
    
    public void display(){
        Node p = head;
        while(p!=null){
            System.out.print(p.info+" ");
            p = p.next;
        }
    }
}
