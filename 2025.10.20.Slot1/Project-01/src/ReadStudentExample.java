/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import java.util.*;

public class ReadStudentExample {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("D:\\students.dat"))) {

            List<Student> students = (List<Student>) ois.readObject();

            System.out.println("✅ Danh sách sinh viên đọc được:");
            for (Student s : students) {
                System.out.printf("ID: %s | Tên: %s | GPA: %.2f%n",
                        s.getId(), s.getName(), s.getGpa());
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
