
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Statue extends Item {

    private int weight;
    private String colour;

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public Statue() {
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===BẮT ĐẦU THÊM TƯỢNG===");
        super.input();
        System.out.print("Nhập cân nặng của tượng: ");
        this.weight = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập màu sắc của tượng: ");
        this.colour = sc.nextLine();
    }

    @Override
    public String toString() {

        return "(STATUE)" + super.toString() + ", Weight: " + weight + ", Colour: " + colour;
    }
}
