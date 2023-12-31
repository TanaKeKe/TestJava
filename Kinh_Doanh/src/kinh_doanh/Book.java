/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kinh_doanh;

public class Book {

    private String Name; // tên sản phẩm
    private String Price; // giá
    private String Trademark; // thương hiệu
    private String Category; // thể loại
    private String Author; // tác giả
    private String Publisher; // nhà xuất bản
    private String Year; // năm xuất bản
    private String Language; // ngôn ngữ

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

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public void printBook() {
        System.out.printf("Name: %s\nPrice: %s\nTrademark: %s\nCategory: %s\nAuthor: %s\nPublisher: %s\nYear: %s\nLanguage: %s\n------",
        this.Name,this.Price,this.Trademark,this.Category,this.Author,this.Publisher,this.Year,this.Language);
    }

    public Book(String Name, String Price, String Trademark, String Category, String Author, String Publisher, String Year, String Language) {
        this.Name = Name;
        this.Price = Price;
        this.Trademark = Trademark;
        this.Category = Category;
        this.Author = Author;
        this.Publisher = Publisher;
        this.Year = Year;
        this.Language = Language;
    }

}
