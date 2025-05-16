/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Ex07 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int b[] = new int[10];
        int c[] = new int[]{1,2,3,4,5};
        int d[] = {1,2,3,4,5};
        
//        for (int i = 0; i < 10; i++) {
//            System.out.println(a[i]);
//            a[i] = i;
//        }
//        
//        for (int i = 0; i < 10; i++) {
//            System.out.println(a[i]);
//        }
        
        System.out.println("----");
        for (int x : a) {
            System.out.println(x);
            x = 99; // read only
        }
        System.out.println("----");
        for (int x : a) {
            System.out.println(x);
        }
    }
}
