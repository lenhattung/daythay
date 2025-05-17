/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Node {

    Object info;
    Node next;

    public Node(Object info, Node next) {
        this.info = info;
        this.next = next;
    }

    public Node(Object info) {
        this.info = info;
    }
    
}
