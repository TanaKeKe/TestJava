/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kinh_doanh;

import java.util.Scanner;
public class Login_Logout {
    String account;
    String password;
    
    public Login_Logout() { // đăng nhập
        Scanner sc = new Scanner(System.in);
        while (true) {
            int check = 0;
            System.out.print("Account: ");
            this.account = sc.nextLine();
            if (this.account.equals("admin")) { // nếu là chủ cửa hàng
                while (true) {
                    System.out.print("Password: ");
                    this.password = sc.nextLine();
                    if (this.password.equals("admin")) { // nếu nhập đúng mật khẩu
                        check = 1;
                        System.out.println("Logged In Successfully!");
                        System.out.println("Hello Admin!");
                        break;
                    }
                    System.out.println("Login Failed!");
                }
            }
            if (check == 1) {
                break;
            }
            if (this.account.equals("khach")) { // nếu là khách
                System.out.println("Logged in successfully!");
                System.out.println("Hello!");
                break;
            }
            System.out.println("Login Failed!");
        }
    }
    
    public void Logout() {
        if (this.account.equals("admin")) {
            System.out.println("Bye Admin!");
        } else {
            System.out.println("Thanks for visitting!");
        }
    }

}
