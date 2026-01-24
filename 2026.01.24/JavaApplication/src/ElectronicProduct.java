/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class ElectronicProduct extends Product{
    private String guaranty, voltage, power;

    public ElectronicProduct() {
    }

    public ElectronicProduct(String code, String name, String make, double price, String guaranty, String voltage, String power) {
        super(code, name, make, price);
        this.guaranty = guaranty;
        this.voltage = voltage;
        this.power = power;
    }

    public String getGuaranty() {
        return guaranty;
    }

    public void setGuaranty(String guaranty) {
        this.guaranty = guaranty;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void xMethod(){
        System.out.println("TEST");
    }
    
    @Override
    public String toString() {
        return String.format("%s, %s, %s, %.2f, %s, %s, %s", getCode(), getName(), getMake(), getPrice(), getGuaranty(), getVoltage(), getPower());
    }
    
}
