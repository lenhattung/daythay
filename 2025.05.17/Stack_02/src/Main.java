/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Main {
    public static void main(String[] args) {
        Book b = new Book(01, "LT Java", "Le Nhat Tung", 10000);
        
        MyStack stack = new MyStack();
        stack.push(b);
    }
}
