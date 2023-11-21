/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nha_sach;

public class Book {
    private String Title; // tiêu đề
    private String Author; // tác giả
    private String Category; // thể loại
    private String Date; // ngày sáng tác

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTitle() {
        return this.Title;
    }

    public String getAuthor() {
        return this.Author;
    }

    public String getCategory() {
        return this.Category;
    }

    public String getDate() {
        return this.Date;
    }
    
    
}
