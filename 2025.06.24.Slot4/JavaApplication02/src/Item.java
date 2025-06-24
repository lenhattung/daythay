
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tungi
 */
public class Item {

    private int value;
    private String creator;

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public Item() {
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setValue(int value) {
        this.value = value >= 0 ? value : 0;
    }

    public void setCreator(String creator) {
        if (creator != null && creator.length() > 3) {
            this.creator = creator;
        }
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị sản phẩm: ");

        int value = Integer.parseInt(sc.nextLine());
        setValue(value);

        System.out.print("Nhập tác giả của sản phẩm: ");
        String name = sc.nextLine();
        setCreator(name);
    }

    @Override
    public String toString() {
        return "Value: " + this.value + ", Creator: " + this.creator;
    }

}
