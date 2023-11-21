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
        System.out.println(x.getTitle() + "    " + x.getAuthor() + "    " + x.getCategory() + "    " + x.getDate() + "    ");
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

    public void FindBook() {
        Scanner sc = new Scanner(System.in);// tìm sách
        System.out.println("How do you want to find books?");
        System.out.println("1.Title");
        System.out.println("2.Author");
        System.out.println("3.Category");
        System.out.println("4.Date");
        System.out.println("Please chose the number you want.");
        // xử lí
        int number = Integer.parseInt(sc.nextLine());
        int check = 0;
        switch (number) {
            case 1 -> {
                System.out.print("Please enter a title: ");
                String tieude = sc.nextLine();
                for (Book x : list) {
                    if (x.getTitle().equals(tieude)) {
                        check = 1;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a title like this!");
                } else {
                    System.out.println("Title   | Author    | Category  | Date  ");
                    System.out.println("--------|-----------|-----------|-------");
                    for (Book x : list) {
                        if (x.getTitle().equals(tieude)) {
                            PrintBook(x);
                        }
                    }
                }
            }
            case 2 -> {
                System.out.print("Please enter a author: ");
                String tacgia = sc.nextLine();
                for (Book x : list) {
                    if (x.getAuthor().equals(tacgia)) {

                        check = 1;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a author like this!");
                } else {
                    System.out.println("Title   | Author    | Category  | Date  ");
                    System.out.println("--------|-----------|-----------|-------");
                    for (Book x : list) {
                        if (x.getAuthor().equals(tacgia)) {
                            PrintBook(x);
                        }
                    }
                }
            }
            case 3 -> {
                System.out.print("Please enter a category: ");
                String theloai = sc.nextLine();
                for (Book x : list) {
                    if (x.getCategory().equals(theloai)) {
                        check = 1;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a category like this!");
                } else {
                    System.out.println("Title   | Author    | Category  | Date  ");
                    System.out.println("--------|-----------|-----------|-------");
                    for (Book x : list) {
                        if (x.getCategory().equals(theloai)) {
                            PrintBook(x);
                        }
                    }
                }
            }
            case 4 -> {
                System.out.print("Please enter a date: ");
                String ngayxuatban = sc.nextLine();
                for (Book x : list) {
                    if (x.getDate().equals(ngayxuatban)) {
                        check = 1;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a date like this!");
                } else {
                    System.out.println("Title   | Author    | Category  | Date  ");
                    System.out.println("--------|-----------|-----------|-------");
                    for (Book x : list) {
                        if (x.getDate().equals(ngayxuatban)) {
                            PrintBook(x);
                        }
                    }
                }
            }

            default ->
                throw new AssertionError();
        }
        sc.close();
    }

    // chức năng của admin
    public void AddBook() {
        Scanner sc = new Scanner(System.in);// thêm sách
        Book book = new Book();
        System.out.print("Title: ");
        String Title = sc.nextLine();
        book.setTitle(Title);
        System.out.print("Author: ");
        String Author = sc.nextLine();
        book.setAuthor(Author);
        System.out.print("Category: ");
        String Category = sc.nextLine();
        book.setCategory(Category);
        System.out.print("Date: ");
        String Date = sc.nextLine();
        book.setDate(Date);
        list.add(book);
        sc.close();
    }

    public void DeleteBook() {
        Scanner sc = new Scanner(System.in);// xóa sách
        System.out.println("How do you want to delete books?");
        System.out.println("1.Title");
        System.out.println("2.Author");
        System.out.println("3.Category");
        System.out.println("4.Date");
        System.out.println("Please chose the number you want.");
        // xử lí
        int number = Integer.parseInt(sc.nextLine());
        int check = 0;
        switch (number) {
            case 1 -> {
                System.out.print("Please enter a title: ");
                String tieude = sc.nextLine();
                for (Book x : list) {
                    if (x.getTitle().equals(tieude)) {
                        list.remove(x);
                        System.out.println("Deleted Successfully!");
                        check = 1;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a title like this!");
                }
            }
            case 2 -> {
                System.out.print("Please enter a author: ");
                String tacgia = sc.nextLine();
                for (Book x : list) {
                    if (x.getAuthor().equals(tacgia)) {
                        list.remove(x);
                        System.out.println("Deleted Successfully!");
                        check = 1;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a author like this!");
                }
            }
            case 3 -> {
                System.out.print("Please enter a category: ");
                String theloai = sc.nextLine();
                for (Book x : list) {
                    if (x.getCategory().equals(theloai)) {
                        list.remove(x);
                        System.out.println("Deleted Successfully!");
                        check = 1;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a category like this!");
                }
            }
            case 4 -> {
                System.out.print("Please enter a date: ");
                String ngayxuatban = sc.nextLine();
                for (Book x : list) {
                    if (x.getDate().equals(ngayxuatban)) {
                        list.remove(x);
                        System.out.println("Deleted Successfully!");
                        check = 1;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a date like this!");
                }
            }
            default ->
                throw new AssertionError();
        }
        sc.close();
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
                    if (x.getTitle().equals(tieude)) {
                        check = 1;
                        break;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a title like this!");
                } else {
                    System.out.println("Please re-enter the book's information!");
                    for (Book x : list) {
                        if (x.getTitle().equals(tieude)) {
                            System.out.print("Title: ");
                            String Title = sc.nextLine();
                            x.setTitle(Title);
                            System.out.print("Author: ");
                            String Author = sc.nextLine();
                            x.setAuthor(Author);
                            System.out.print("Category: ");
                            String Category = sc.nextLine();
                            x.setCategory(Category);
                            System.out.print("Date: ");
                            String Date = sc.nextLine();
                            x.setDate(Date);
                        }
                    }
                }
            }
            case 2 -> {
                System.out.print("Please enter a author: ");
                String tacgia = sc.nextLine();
                for (Book x : list) {
                    if (x.getAuthor().equals(tacgia)) {
                        check = 1;
                        break;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a author like this!");
                } else {
                    System.out.println("Please re-enter the book's information!");
                    for (Book x : list) {
                        if (x.getAuthor().equals(tacgia)) {
                            System.out.print("Title: ");
                            String Title = sc.nextLine();
                            x.setTitle(Title);
                            System.out.print("Author: ");
                            String Author = sc.nextLine();
                            x.setAuthor(Author);
                            System.out.print("Category: ");
                            String Category = sc.nextLine();
                            x.setCategory(Category);
                            System.out.print("Date: ");
                            String Date = sc.nextLine();
                            x.setDate(Date);
                        }
                    }
                }
            }
            case 3 -> {
                System.out.print("Please enter a category: ");
                String theloai = sc.nextLine();
                for (Book x : list) {
                    if (x.getCategory().equals(theloai)) {
                        check = 1;
                        break;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a category like this!");
                } else {
                    System.out.println("Please re-enter the book's information!");
                    for (Book x : list) {
                        if (x.getCategory().equals(theloai)) {
                            System.out.print("Title: ");
                            String Title = sc.nextLine();
                            x.setTitle(Title);
                            System.out.print("Author: ");
                            String Author = sc.nextLine();
                            x.setAuthor(Author);
                            System.out.print("Category: ");
                            String Category = sc.nextLine();
                            x.setCategory(Category);
                            System.out.print("Date: ");
                            String Date = sc.nextLine();
                            x.setDate(Date);
                        }
                    }
                }
            }
            case 4 -> {
                System.out.print("Please enter a date: ");
                String ngayxuatban = sc.nextLine();
                for (Book x : list) {
                    if (x.getDate().equals(ngayxuatban)) {
                        check = 1;
                        break;
                    }
                }
                if (check == 0) {
                    System.out.println("There is no other book with a date like this!");
                } else {
                    System.out.println("Please re-enter the book's information!");
                    for (Book x : list) {
                        if (x.getDate().equals(ngayxuatban)) {
                            System.out.print("Title: ");
                            String Title = sc.nextLine();
                            x.setTitle(Title);
                            System.out.print("Author: ");
                            String Author = sc.nextLine();
                            x.setAuthor(Author);
                            System.out.print("Category: ");
                            String Category = sc.nextLine();
                            x.setCategory(Category);
                            System.out.print("Date: ");
                            String Date = sc.nextLine();
                            x.setDate(Date);
                        }
                    }
                }
            }
            default ->
                throw new AssertionError();
        }
        sc.close();
    }
}
