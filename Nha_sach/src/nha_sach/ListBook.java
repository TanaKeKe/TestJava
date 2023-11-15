/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nha_sach;

import java.util.ArrayList;
import java.util.Scanner;
public class ListBook {
    ArrayList<Book> list = new ArrayList<>(); // list gồm danh sách các cuốn sách
    // Chức năng của khách + admin

    public void PrintBook(Book x) { // in các cuốn sách
        System.out.println(x.Title + "    " + x.Author + "    " + x.Category + "    " + x.Date + "    ");
        System.out.println("--------|-----------|-----------|-------");
    }
    
    public void PrintList() { // in danh sách các cuốn sách
        if (list.isEmpty()) {
            System.out.println("Empty List!");
        } else {
            System.out.println("Title   | Author    | Category  | Date  ");
            System.out.println("--------|-----------|-----------|-------");
            for (Book x : list) {
                PrintBook(x);
            }
        }
    }
    
    public void FindBook() { // tìm sách
        System.out.println("How do you want to find books?");
        System.out.println("1.Title");
        System.out.println("2.Author");
        System.out.println("3.Category");
        System.out.println("4.Date");
        System.out.println("Please chose the number you want.");
        // xử lí
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int check = 0;
        switch (number) {
            case 1 -> {
                System.out.print("Please enter a title: ");
                String tieude = sc.nextLine();
                for (Book x : list) {
                    if (x.Title.equals(tieude)) {
                        check = 1;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a title like this!");
                } else {
                    System.out.println("Title   | Author    | Category  | Date  ");
                    System.out.println("--------|-----------|-----------|-------");
                    for (Book x : list) {
                        if (x.Title.equals(tieude)) {
                            PrintBook(x);
                        }
                    }
                }
                break;
            }
            case 2 -> {
                System.out.print("Please enter a author: ");
                String tacgia = sc.nextLine();
                for (Book x : list) {
                    if (x.Author.equals(tacgia)) {
                        
                        check = 1;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a author like this!");
                } else {
                    System.out.println("Title   | Author    | Category  | Date  ");
                    System.out.println("--------|-----------|-----------|-------");
                    for (Book x : list) {
                        if (x.Author.equals(tacgia)  {
                            PrintBook(x);
                        }
                    }
                }
                break;
            }
            case 3 -> {
                System.out.print("Please enter a category: ");
                String theloai = sc.nextLine();
                for (Book x : list) {
                    if (x.Category.equals(theloai)) {
                        check = 1;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a category like this!");
                } else {
                    System.out.println("Title   | Author    | Category  | Date  ");
                    System.out.println("--------|-----------|-----------|-------");
                    for (Book x : list) {
                        if (x.Category.equals(theloai)) {
                            PrintBook(x);
                        }
                    }
                }
                break;
            }
            case 4 -> {
                System.out.print("Please enter a date: ");
                String ngayxuatban = sc.nextLine();
                for (Book x : list) {
                    if (x.Date.equals(ngayxuatban)) {
                        check = 1;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a date like this!");
                } else {
                    System.out.println("Title   | Author    | Category  | Date  ");
                    System.out.println("--------|-----------|-----------|-------");
                    for (Book x : list) {
                        if (x.Date.equals(ngayxuatban)) {
                            PrintBook(x);
                        }
                    }
                }
                break;
            }
            
            default ->
                throw new AssertionError();
        }
    }

    // chức năng của admin
    public void AddBook() { // thêm sách
        Book book = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.print("Title: ");
        book.Title = sc.nextLine();
        System.out.print("Author: ");
        book.Author = sc.nextLine();
        System.out.print("Category: ");
        book.Category = sc.nextLine();
        System.out.print("Date: ");
        book.Date = sc.nextLine();
        list.add(book);
    }
    
    public void DeleteBook() { // xóa sách
        System.out.println("How do you want to delete books?");
        System.out.println("1.Title");
        System.out.println("2.Author");
        System.out.println("3.Category");
        System.out.println("4.Date");
        System.out.println("Please chose the number you want.");
        // xử lí
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int check = 0;
        switch (number) {
            case 1 -> {
                System.out.print("Please enter a title: ");
                String tieude = sc.nextLine();
                for (Book x : list) {
                    if (x.Title.equals(tieude)) {
                        list.remove(x);
                        check = 1;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a title like this!");
                }
                break;
            }
            case 2 -> {
                System.out.print("Please enter a author: ");
                String tacgia = sc.nextLine();
                for (Book x : list) {
                    if (x.Author.equals(tacgia)) {
                        list.remove(x);
                        check = 1;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a author like this!");
                }
                break;
            }
            case 3 -> {
                System.out.print("Please enter a category: ");
                String theloai = sc.nextLine();
                for (Book x : list) {
                    if (x.Category.equals(theloai)) {
                        list.remove(x);
                        check = 1;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a category like this!");
                }
                break;
            }
            case 4 -> {
                System.out.print("Please enter a date: ");
                String ngayxuatban = sc.nextLine();
                for (Book x : list) {
                    if (x.Date.equals(ngayxuatban)) {
                        list.remove(x);
                        check = 1;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a date like this!");
                }
                break;
            }
            default ->
                throw new AssertionError();
        }
    }

    // sửa sách
    public void FixBook() {
        System.out.println("How do you want to fix books?");
        System.out.println("1.Title");
        System.out.println("2.Author");
        System.out.println("3.Category");
        System.out.println("4.Date");
        System.out.println("Please chose the number you want.");
        // xử lí
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int check = 0;
        switch (number) {
            case 1 -> {
                System.out.print("Please enter a title: ");
                String tieude = sc.nextLine();
                for (Book x : list) {
                    if (x.Title.equals(tieude)) {
                        check = 1;
                        break;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a title like this!");
                } else {
                    System.out.println("Please re-enter the book's information!");
                    for (Book x : list) {
                        if (x.Title.equals(tieude)) {
                            System.out.print("Title: ");
                            x.Title = sc.nextLine();
                            System.out.print("Author: ");
                            x.Author = sc.nextLine();
                            System.out.print("Category: ");
                            x.Category = sc.nextLine();
                            System.out.print("Date: ");
                            x.Date = sc.nextLine();
                        }
                    }
                }
                break;
            }
            case 2 -> {
                System.out.print("Please enter a author: ");
                String tacgia = sc.nextLine();
                for (Book x : list) {
                    if (x.Author.equals(tacgia)) {
                        check = 1;
                        break;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a author like this!");
                } else {
                    System.out.println("Please re-enter the book's information!");
                    for (Book x : list) {
                        if (x.Author.equals(tacgia)) {
                            System.out.print("Title: ");
                            x.Title = sc.nextLine();
                            System.out.print("Author: ");
                            x.Author = sc.nextLine();
                            System.out.print("Category: ");
                            x.Category = sc.nextLine();
                            System.out.print("Date: ");
                            x.Date = sc.nextLine();
                        }
                    }
                }
                break;
            }
            case 3 -> {
                System.out.print("Please enter a category: ");
                String theloai = sc.nextLine();
                for (Book x : list) {
                    if (x.Category.equals(theloai)) {
                        check = 1;
                        break;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a category like this!");
                } else {
                    System.out.println("Please re-enter the book's information!");
                    for (Book x : list) {
                        if (x.Category.equals(theloai)) {
                            System.out.print("Title: ");
                            x.Title = sc.nextLine();
                            System.out.print("Author: ");
                            x.Author = sc.nextLine();
                            System.out.print("Category: ");
                            x.Category = sc.nextLine();
                            System.out.print("Date: ");
                            x.Date = sc.nextLine();
                        }
                    }
                }
                break;
            }
            case 4 -> {
                System.out.print("Please enter a date: ");
                String ngayxuatban = sc.nextLine();
                for (Book x : list) {
                    if (x.Date.equals(ngayxuatban)) {
                        check = 1;
                        break;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a date like this!");
                } else {
                    System.out.println("Please re-enter the book's information!");
                    for (Book x : list) {
                        if (x.Date.equals(ngayxuatban)) {
                            System.out.print("Title: ");
                            x.Title = sc.nextLine();
                            System.out.print("Author: ");
                            x.Author = sc.nextLine();
                            System.out.print("Category: ");
                            x.Category = sc.nextLine();
                            System.out.print("Date: ");
                            x.Date = sc.nextLine();
                        }
                    }
                }
                break;
            }
            default ->
                throw new AssertionError();
        }
    }
}
