/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kinh_doanh;

import java.util.Scanner;
public class Login_Logout {
    private String account;
    private String password;

    public final String getAccount() {
        return account;
    }

    public final void setAccount(String account) {
        this.account = account;
    }

    public final String getPassword() {
        return password;
    }

    public final void setPassword(String password) {
        this.password = password;
    }
    
    public Login_Logout() { // đăng nhập
        Scanner sc = new Scanner(System.in);
        while (true) {
            int check = 0;
            System.out.print("Account: ");
            setAccount(sc.nextLine());
            if (getAccount().equals("admin")) { // nếu là chủ cửa hàng
                while (true) {
                    System.out.print("Password: ");
                    setPassword(sc.nextLine());
                    if (getPassword().equals("admin")) { // nếu nhập đúng mật khẩu
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
            if (getAccount().equals("khach")) { // nếu là khách
                System.out.println("Logged in successfully!");
                System.out.println("Hello!");
                break;
            }
            System.out.println("Login Failed!");
        }
    }
    
    public void Logout() {
        if (getAccount().equals("admin")) {
            System.out.println("Bye Admin!");
        } else {
            System.out.println("Thanks for visitting!");
        }
    }

}
