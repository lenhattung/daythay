
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Painting extends Item {

    private int height, width;
    private boolean isWatercolour, isFramed;

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public Painting() {
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===BẮT ĐẦU THÊM TRANH===");
        super.input();
        System.out.print("Nhập chiều cao của tranh: ");
        this.height = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập chiều rộng của tranh: ");
        this.width = Integer.parseInt(sc.nextLine());
        System.out.println("Tranh có sử dụng màu nước không?");
        System.out.println("1. Có\n2,Không");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                this.isWatercolour = true;
                break;
            case 2:
                this.isWatercolour = false;
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                break;
        }

        System.out.println("Tranh có đóng khung không?");
        System.out.println("1. Có\n2,Không");
        choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                this.isFramed = true;
                break;
            case 2:
                this.isFramed = false;
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại");
                break;
        }
    }

    @Override
    public String toString() {

        return "(PAINTING) " + super.toString() + ", Height: " + height + ", Width: " + width + ", Có Màu Nước?: " + isWatercolour + ", Có đóng khung?: " + isFramed;
    }
}
