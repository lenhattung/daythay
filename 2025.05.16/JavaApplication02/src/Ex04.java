/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Ex04 {

    public static void main(String[] args) {
        int y = 5;
        System.out.println("5>>1: " + (y >> 1));
        
        int x = -1;
        System.out.println("-1<<1: " + (x << 1)); //-2
        System.out.println("-1>>1: " + (x >> 1)); //-1
        System.out.println("-1>>>1: " + (x >>> 1)); ///....
        
        System.out.println(10&7);
        System.out.println(10|7);
        System.out.println(10^7);
    }
}
