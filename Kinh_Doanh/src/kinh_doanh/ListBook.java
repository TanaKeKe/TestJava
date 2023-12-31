/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kinh_doanh;

import java.util.ArrayList;
import java.util.Scanner;

// danh sách sách
public class ListBook {

    ArrayList<Book> book = new ArrayList<>();

    // in 1 cuốn sách theo dạng list

    // in nhiều cuốn sách có xâu kí tự đầu vào
    public void PrintListBook(String keyword) {
        for (Book x : book) {
            if (x.getTrademark().contains(keyword) || x.getName().contains(keyword) || x.getPrice().contains(keyword) || x.getCategory().contains(keyword) || x.getAuthor().contains(keyword) || x.getPublisher().contains(keyword) || x.getYear().contains(keyword) || x.getLanguage().contains(keyword)) {
                x.printBook();
            }
        }
    }

    // in nhiều cuốn theo bảng
    public void PrintTableBook(String keyword) {
        for (Book x : book) {
            if (x.getTrademark().contains(keyword) ||x.getName().contains(keyword) || x.getPrice().contains(keyword) || x.getCategory().contains(keyword) || x.getAuthor().contains(keyword) || x.getPublisher().contains(keyword) || x.getYear().contains(keyword) || x.getLanguage().contains(keyword)) {
                System.out.printf("|%-15s|%-12s|%-30s|- Category: %-30s|\n",x.getName(),x.getPrice(),x.getTrademark(),x.getCategory());
                System.out.printf("|               |            |                              |- Author: %-30s\n",x.getAuthor());
                System.out.printf("|               |            |                              |- Publisher: %-30s\n",x.getPublisher());
                System.out.printf("|               |            |                              |- Year: %-30s\n",x.getYear());
                System.out.printf("|               |            |                              |- Language: %-30s\n",x.getLanguage());
                System.out.println("|---------------|------------|------------------------------|------------------------------");
            }
        }
    }
    
    // thêm sách
    public void AddBook() {
        System.out.println("Please enter the following information!");
        Scanner sc = new Scanner(System.in);
        String Name, Price, Trademark, Category, Author, Publisher, Year, Language;
        System.out.print("Name: "); Name=sc.nextLine();
        System.out.print("Price: "); Price=sc.nextLine();
        System.out.print("Trademark: "); Trademark=sc.nextLine();
        System.out.print("Category: "); Category=sc.nextLine();
        System.out.print("Author: "); Author=sc.nextLine();
        System.out.print("Publisher: "); Publisher=sc.nextLine();
        System.out.print("Year: "); Year=sc.nextLine();
        System.out.print("Language: "); Language=sc.nextLine();
        Book newBook = new Book(Name, Price, Trademark, Category, Author, Publisher, Year, Language);
        book.add(newBook);
        System.out.println("Added books successfully!");
    }

    // sửa sách
    public void FixBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the book you want to edit: ");
        String namebook = sc.nextLine();
        int count = 0;
        for (Book x : book) {
            if (x.getName().equals(namebook)) {
                // in tư liệu thêm code dạng list vào đây
                x.printBook();
                System.out.print("Is this the book you want to edit? (y/n): ");
                String check = sc.nextLine();
                if ("y".equals(check)) {
                    count = 1;
                    System.out.print("Which function do you want to edit? (name, price,trademark, category, author,publisher, year,language): ");
                    String namefunction = sc.nextLine(); // nhập tên chức năng muốn sửa
                    if (namefunction.equals("name")) {
                        String tmp = sc.nextLine();
                        x.setName(tmp);
                    } else if (namefunction.equals("price")) {
                        String tmp = sc.nextLine();
                        x.setPrice(tmp);
                    } else if (namefunction.equals("category")) {
                        String tmp = sc.nextLine();
                        x.setCategory(tmp);
                    } else if (namefunction.equals("author")) {
                        String tmp = sc.nextLine();
                        x.setAuthor(tmp);
                    } else if (namefunction.equals("publisher")) {
                        String tmp = sc.nextLine();
                        x.setPublisher(tmp);
                    } else if (namefunction.equals("year")) {
                        String tmp = sc.nextLine();
                        x.setYear(tmp);
                    } else if (namefunction.equals("language")) {
                        String tmp = sc.nextLine();
                        x.setLanguage(tmp);
                    } else if (namefunction.equals("trademark")) {
                        String tmp = sc.nextLine();
                        x.setTrademark(tmp);
                    }
                    System.out.println("Successfully edited the book!");
                }
            }
        }

        if (count == 0) {
            System.out.println("Books do not exist!");
        }
    }

    public void DeleteBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the book you want to edit: ");
        String namebook = sc.nextLine();
        int count = 0;
        for (Book x : book) {
            if (x.getName().equals(namebook)) {
                // in tư liệu thêm code dạng list vào đây
                x.printBook();
                System.out.print("Is this the book you want to delete? (y/n): ");
                String check = sc.nextLine();
                if ("y".equals(check)) {
                    count = 1;
                    book.remove(x);
                    System.out.println("Successfully deleted the book!");
                }
            }
        }

        if (count == 0) {
            System.out.println("Books do not exist!");
        }
    }

}
