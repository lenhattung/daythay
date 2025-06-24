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
        int[] a;
        int b[];

        String[] names;

        String[] arr = new String[100];
        Student sts[] = new Student[100];
        String[] arr2 = new String[]{"Linh", "Hang", "Tien", "Supachok", "Anh Long"};
        String arr3[] = {"Hanoi", "HCM", "Danang", "Quy Nhon", "Can Tho", "Tan Uyen"};

//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i] + " : " + arr2[i].length());
//            arr2[i] = arr2[i] + i;
//        }
//
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i] + " : " + arr2[i].length());
//        }

        for (String s : arr3) {
            System.out.println(s);
            s=s+1;
        }
        System.out.println("----");
        for (String s : arr3) {
            System.out.println(s);
        }
    }
}
