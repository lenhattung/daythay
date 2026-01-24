/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Tester {
    public static void main(String[] args) {
        Product p1 = new Product("01", "ABC", "FPT", 50000);
        System.out.println(p1);
        
        Product p2 = new ElectronicProduct("02", "BCD", "FPT", 100000, "12 months", "220v", "65wh");
        System.out.println(p2);
        
        ElectronicProduct e = new ElectronicProduct("03", "BCD", "FPT", 100000, "12 months", "220v", "65wh"); 
        e.xMethod();
    }
}
