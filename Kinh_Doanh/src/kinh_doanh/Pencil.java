/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kinh_doanh;
public class Pencil {
    private String Name; // tên sản phẩm
    private String Price; // giá
    private String Trademark; // thương hiệu
    private String Color; // màu sắc
    private String Material; // chất liệu
    private String Stiffness; // độ cứng

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getTrademark() {
        return Trademark;
    }

    public void setTrademark(String Trademark) {
        this.Trademark = Trademark;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public String getStiffness() {
        return Stiffness;
    }

    public void setStiffness(String Stiffness) {
        this.Stiffness = Stiffness;
    }

    public void printPencil() {
        System.out.printf("Name: %s\nPrice: %s\nTrademark: %s\nColor: %s\nMaterial: %s\nStiffness: %s\n------",
                this.Name, this.Price, this.Trademark, this.Color, this.Material, this.Stiffness);
    }

    public Pencil(String Name, String Price, String Trademark, String Color, String Material, String Stiffness) {
        this.Name = Name;
        this.Price = Price;
        this.Trademark = Trademark;
        this.Color = Color;
        this.Material = Material;
        this.Stiffness = Stiffness;
    }
    
}
