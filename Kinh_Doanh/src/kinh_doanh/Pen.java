/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kinh_doanh;
public class Pen {
    private String Name; // tên sản phẩm
    private String Price; // giá
    private String Trademark; // thương hiệu
    private String Color; // màu sắc
    private String Material; // chất liệu
    private String TypeOfInk; // loại mực
    private String Smoothly; // độ mịn

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

    public String getTypeOfInk() {
        return TypeOfInk;
    }

    public void setTypeOfInk(String TypeOfInk) {
        this.TypeOfInk = TypeOfInk;
    }

    public String getSmoothly() {
        return Smoothly;
    }

    public void setSmoothly(String Smoothly) {
        this.Smoothly = Smoothly;
    }

    public void printPen() {
        System.out.printf("Name: %s\nPrice: %s\nTrademark: %s\nColor: %s\nMaterial: %s\nType Of Ink: %s\nSmoothly: %s\n------",
                this.Name, this.Price, this.Trademark, this.Color, this.Material, this.TypeOfInk, this.Smoothly);
    }

    public Pen(String Name, String Price, String Trademark, String Color, String Material, String TypeOfInk, String Smoothly) {
        this.Name = Name;
        this.Price = Price;
        this.Trademark = Trademark;
        this.Color = Color;
        this.Material = Material;
        this.TypeOfInk = TypeOfInk;
        this.Smoothly = Smoothly;
    }
    
    
}
