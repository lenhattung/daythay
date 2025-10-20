/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
import java.io.*;

public class WriteUTF8Example {

    public static void main(String[] args) {
        String fileName = "D:\\data.txt";
        try {
            Writer writer = new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8");
            writer.write("Xin chào!\n");
            writer.write("Đây là file ghi bằng mã hóa UTF-8.\n");
            writer.write("Học Java thật met!");
            
            writer.flush();
            writer.close();
            System.out.println("Ghi file thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
