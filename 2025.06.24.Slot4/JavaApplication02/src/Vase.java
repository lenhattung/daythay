
import java.util.Scanner;


public class Vase extends Item {

    private int height;
    private String material;

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public Vase() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height>0?height:0;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===BẮT ĐẦU THÊM BÌNH");
        super.input();
        System.out.print("Nhập chiều cao của bình: ");
        int height = Integer.parseInt(sc.nextLine());
        setHeight(height);
        System.out.print("Nhập vật liệu của bình: ");
        String material = sc.nextLine();
        setMaterial(material);
    }

    @Override
    public String toString() {
        return "(VASE) " + super.toString() + ", height: " + height + ", Material: " + material;
    }
}
