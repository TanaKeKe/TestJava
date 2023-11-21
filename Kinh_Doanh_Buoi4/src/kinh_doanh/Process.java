/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kinh_doanh;

import java.util.Scanner;

public class Process {

    ListBook listbook = new ListBook();
    ListNoteBook listnotebook = new ListNoteBook();
    ListPen listpen = new ListPen();
    ListPencil listpencil = new ListPencil();

    public void play() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Login_Logout person = new Login_Logout();
            if (person.account.equals("admin")) { // nếu đăng nhập dưới tư cách là admin
                while (true) {
                    System.out.println("----------MENU----------");
                    System.out.println("1. Add                  ");
                    System.out.println("2. Fix                  ");
                    System.out.println("3. Delete               ");
                    System.out.println("4. Find                 ");
                    System.out.print("Choose the number you want: ");
                    int number = Integer.parseInt(sc.nextLine());
                    if (number == 1) {
                        System.out.println("----------MENU----------");
                        System.out.println("1. Add Book             ");
                        System.out.println("2. Add NoteBook         ");
                        System.out.println("3. Add Pen              ");
                        System.out.println("4. Add Pencil           ");
                        System.out.print("Choose the number you want: ");
                        number = Integer.parseInt(sc.nextLine());
                        if (number == 1) {
                            listbook.AddBook();
                        } else if (number == 2) {
                            listnotebook.AddNoteBook();
                        } else if (number == 3) {
                            listpen.AddPen();
                        } else if (number == 4) {
                            listpencil.AddPencil();
                        } else {
                            System.out.println("Invalid!");
                        }
                    } else if (number == 2) {
                        System.out.println("----------MENU----------");
                        System.out.println("1. Fix Book             ");
                        System.out.println("2. Fix NoteBook         ");
                        System.out.println("3. Fix Pen              ");
                        System.out.println("4. Fix Pencil           ");
                        System.out.print("Choose the number you want: ");
                        number = Integer.parseInt(sc.nextLine());
                        if (number == 1) {
                            listbook.FixBook();
                        } else if (number == 2) {
                            listnotebook.FixNoteBook();
                        } else if (number == 3) {
                            listpen.FixPen();
                        } else if (number == 4) {
                            listpencil.FixPencil();
                        } else {
                            System.out.println("Invalid!");
                        }
                    } else if (number == 3) {
                        System.out.println("----------MENU----------");
                        System.out.println("1. Delete Book          ");
                        System.out.println("2. Delete NoteBook      ");
                        System.out.println("3. Delete Pen           ");
                        System.out.println("4. Delete Pencil        ");
                        System.out.print("Choose the number you want: ");
                        number = Integer.parseInt(sc.nextLine());
                        if (number == 1) {
                            listbook.DeleteBook();
                        } else if (number == 2) {
                            listnotebook.DeleteNoteBook();
                        } else if (number == 3) {
                            listpen.DeletePen();
                        } else if (number == 4) {
                            listpencil.DeletePencil();
                        } else {
                            System.out.println("Invalid!");
                        }
                    } else if (number == 4) {
                        System.out.print("Enter the keyword you want to find: ");
                        String keyword = sc.nextLine();
                        System.out.print("Do you want to print a list or a table? (list,table): ");
                        String form = sc.nextLine();
                        if (form.equals("list")) {
                            System.out.println("List of searchable products:");
                            System.out.println("------");
                            listnotebook.PrintListNoteBook(keyword);
                            listpencil.PrintListPencil(keyword);
                            listpen.PrintListPen(keyword);
                            listbook.PrintListBook(keyword);
                        } else if (form.equals("table")) {
                            System.out.printf("|%-15s|%-12s|%-30s|- Color: %-30s\n", "Name", "Price", "Trademark", "More Information");
                            System.out.println("|---------------|------------|------------------------------|------------------------------");
                            listnotebook.PrintTableNoteBook(keyword);
                            listpencil.PrintTablePencil(keyword);
                            listpen.PrintTablePen(keyword);
                            listbook.PrintTableBook(keyword);
                        } else {
                            System.out.println("Invalid");
                        }
                    } else {
                        System.out.println("Invalid");
                    }
                    System.out.print("Do you want to log out? (y/n): ");
                    String chose = sc.nextLine();
                    if (chose.equals("y")) {
                        person.Logout();
                        break;
                    }
                }
            } else { // nếu đăng nhập dưới tư cách là khách hàng
                while (true) {
                    System.out.print("Enter the keyword you want to find: ");
                    String keyword = sc.nextLine();
                    System.out.print("Do you want to print a list or a table? (list,table): ");
                    String form = sc.nextLine();
                    if (form.equals("list")) {
                        System.out.println("List of searchable products:");
                        System.out.println("------");
                        listnotebook.PrintListNoteBook(keyword);
                        listpencil.PrintListPencil(keyword);
                        listpen.PrintListPen(keyword);
                        listbook.PrintListBook(keyword);
                    } else if (form.equals("table")) {
                        System.out.printf("|%-15s|%-12s|%-30s|- Color: %-30s\n", "Name", "Price", "Trademark", "More Information");
                        System.out.println("|---------------|------------|------------------------------|------------------------------");
                        listnotebook.PrintTableNoteBook(keyword);
                        listpencil.PrintTablePencil(keyword);
                        listpen.PrintTablePen(keyword);
                        listbook.PrintTableBook(keyword);
                    } else {
                        System.out.println("Invalid");
                    }
                    System.out.print("Do you want to log out? (y/n): ");
                    String chose = sc.nextLine();
                    if (chose.equals("y")) {
                        person.Logout();
                        break;
                    }
                }
            }

            System.out.print("Do you want to end the progam? (y/n): ");
            String luachon = sc.nextLine();
            if (luachon.equals("y")) {
                System.out.println("Thanks for running the program!");
                break;
            }
        }
    }
}
