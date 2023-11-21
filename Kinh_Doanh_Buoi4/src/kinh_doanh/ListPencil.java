/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kinh_doanh;

import java.util.ArrayList;
import java.util.Scanner;

public class ListPencil {
    ArrayList<Pencil> pencil = new ArrayList<>();

    public void PrintPencil(Pencil x) {
        System.out.println("Name: " + x.getName());
        System.out.println("Price: " + x.getPrice());
        System.out.println("Trademark: " + x.getTrademark());
        System.out.println("Color: " + x.getColor());
        System.out.println("Material: " + x.getMaterial());
        System.out.println("Stiffness: " + x.getStiffness());
        System.out.println("------");
    }
    
    public void PrintListPencil(String keyword) {
        for (Pencil x : pencil) {
            if (x.getTrademark().contains(keyword) || x.getName().contains(keyword) || x.getPrice().contains(keyword) || x.getColor().contains(keyword) || x.getMaterial().contains(keyword) || x.getStiffness().contains(keyword)) {
                PrintPencil(x);
            }
        }
    }

    public void PrintTablePencil(String keyword) {
        for (Pencil x : pencil) {
            if (x.getTrademark().contains(keyword) || x.getName().contains(keyword) || x.getPrice().contains(keyword) || x.getColor().contains(keyword) || x.getMaterial().contains(keyword) || x.getStiffness().contains(keyword)) {
                System.out.printf("|%-15s|%-12s|%-30s|- Color: %-30s\n",x.getName(),x.getPrice(),x.getTrademark(),x.getColor());
                System.out.printf("|               |            |                              |- Material: %-30s\n",x.getMaterial());
                System.out.printf("|               |            |                              |- Stiffness: %-30s\n",x.getStiffness());
                System.out.println("|---------------|------------|------------------------------|------------------------------");
            }
        }
    }
    
    // thêm sách
    public void AddPencil() {
        System.out.println("Please enter the following information!");
        Scanner sc = new Scanner(System.in);
        Pencil x = new Pencil();
        String tmpString;

        System.out.print("Name: ");
        tmpString = sc.nextLine();
        x.setName(tmpString);

        System.out.print("Price: ");
        tmpString = sc.nextLine();
        x.setPrice(tmpString);

        System.out.print("Trademark: ");
        tmpString = sc.nextLine();
        x.setTrademark(tmpString);

        System.out.print("Color: ");
        tmpString = sc.nextLine();
        x.setColor(tmpString);

        System.out.print("Material: ");
        tmpString = sc.nextLine();
        x.setMaterial(tmpString);

        System.out.print("Stiffness: ");
        tmpString = sc.nextLine();
        x.setStiffness(tmpString);

        pencil.add(x);
        System.out.println("Added pencils successfully!");
    }

    // sửa sách
    public void FixPencil() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the pencil you want to edit: ");
        String namepencil = sc.nextLine();
        int count = 0;
        for (Pencil x : pencil) {
            if (x.getName().equals(namepencil)) {
                // in tư liệu thêm code dạng list vào đây
                PrintPencil(x);
                System.out.print("Is this the pencil you want to edit? (y/n): ");
                String check = sc.nextLine();
                if ("y".equals(check)) {
                    count = 1;
                    System.out.print("Which function do you want to edit? (name, price,trademark,color ,material, stiffness): ");
                    String namefunction = sc.nextLine(); // nhập tên chức năng muốn sửa
                    if (namefunction.equals("name")) {
                        String tmp = sc.nextLine();
                        x.setName(tmp);
                    } else if (namefunction.equals("price")) {
                        String tmp = sc.nextLine();
                        x.setPrice(tmp);
                    } else if (namefunction.equals("trademark")) {
                        String tmp = sc.nextLine();
                        x.setTrademark(tmp);
                    } else if (namefunction.equals("color")) {
                        String tmp = sc.nextLine();
                        x.setColor(tmp);
                    } else if (namefunction.equals("material")) {
                        String tmp = sc.nextLine();
                        x.setMaterial(tmp);
                    } else if (namefunction.equals("stiffness")) {
                        String tmp = sc.nextLine();
                        x.setStiffness(tmp);
                    }
                    System.out.println("Successfully edited the pencils!");
                }
            }
        }

        if (count == 0) {
            System.out.println("Pencils do not exist!");
        }
    }

    public void DeletePencil() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the pencil you want to edit: ");
        String namepencil = sc.nextLine();
        int count = 0;
        for (Pencil x : pencil) {
            if (x.getName().equals(namepencil)) {
                // in tư liệu thêm code dạng list vào đây
                PrintPencil(x);
                System.out.print("Is this the pencil you want to delete? (y/n): ");
                String check = sc.nextLine();
                if ("y".equals(check)) {
                    count = 1;
                    pencil.remove(x);
                    System.out.println("Successfully deleted the pencils!");
                }
            }
        }

        if (count == 0) {
            System.out.println("Pencils do not exist!");
        }
    }
}
