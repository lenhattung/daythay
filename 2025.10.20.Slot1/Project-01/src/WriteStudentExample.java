/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
import java.io.*;
import java.util.*;

public class WriteStudentExample {
    public static void main(String[] args) {
        // Tạo danh sách sinh viên
        List<Student> students = new ArrayList<>();
        students.add(new Student("S001", "Nguyễn Văn Tùng", 9.2));
        students.add(new Student("S002", "Trần Thị Dung", 8.5));
        students.add(new Student("S003", "Bùi Ngọc Dung", 7.8));

        // Ghi danh sách vào file
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("D:\\students.dat"))) {

            oos.writeObject(students);
            System.out.println("✅ Ghi danh sách sinh viên thành công!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
