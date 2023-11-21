/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nha_sach;

import java.util.Scanner;
public class Process {
    ListBook list = new ListBook();
    
    public void play() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Login_Logout person = new Login_Logout();
            if (person.account.equals("admin")) { // nếu đăng nhập dưới tư cách là admin
                while (true) {
                    System.out.println("----------------MENU----------------");
                    System.out.println("1. Add Book                         ");
                    System.out.println("2. Delete Book                      ");
                    System.out.println("3. Fix Book                         ");
                    System.out.println("4. Find Book                         ");
                    System.out.println("5. See Book List                     ");
                    System.out.println("Please chose your number you want.  ");
                    int number = Integer.parseInt(sc.nextLine());
                    switch (number) {
                        case 1 -> {
                            list.AddBook();
                            break;
                        }
                        case 2 -> {
                            list.DeleteBook();
                            break;
                        }
                        case 3 -> {
                            list.FixBook();
                            break;
                        }
                        case 4 -> {
                            list.FindBook();
                            break;
                        }
                        case 5 -> {
                            list.PrintList();
                            break;
                        }
                        default ->
                            throw new AssertionError();
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
                    System.out.println("----------------MENU----------------");
                    System.out.println("1. Find Book                         ");
                    System.out.println("2. See Book List                     ");
                    System.out.println("Please chose your number you want.  ");
                    int number = Integer.parseInt(sc.nextLine());
                    switch (number) {
                        case 1 -> {
                            list.FindBook();
                            break;
                        }
                        case 2 -> {
                            list.PrintList();
                            break;
                        }
                        default ->
                            throw new AssertionError();
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
