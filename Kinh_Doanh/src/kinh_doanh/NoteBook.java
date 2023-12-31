/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kinh_doanh;
public class NoteBook {
    private String Name; // tên sản phẩm
    private String Price; // giá
    private String Trademark; // thương hiệu
    private String NumberOfPages; // số trang
    private String Type; // loại vở
    private String Color; // màu sắc
    private String Material; // chất liệu giấy
    private String Size; // kích thước

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

    public String getNumberOfPages() {
        return NumberOfPages;
    }

    public void setNumberOfPages(String NumberOfPages) {
        this.NumberOfPages = NumberOfPages;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
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

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public void printNoteBook() {
        System.out.printf("Name: %s\nPrice: %s\nTrademark: %s\nNumberOfPages: %s\nType: %s\nColor: %s\nMaterial: %s\nSize: %s\n------",
                this.Name, this.Price, this.Trademark, this.NumberOfPages, this.Type, this.Color, this.Material, this.Size); 
                
    }

    public NoteBook(String Name, String Price, String Trademark, String NumberOfPages, String Type, String Color, String Material, String Size) {
        this.Name = Name;
        this.Price = Price;
        this.Trademark = Trademark;
        this.NumberOfPages = NumberOfPages;
        this.Type = Type;
        this.Color = Color;
        this.Material = Material;
        this.Size = Size;
    }
    
    
    
}
