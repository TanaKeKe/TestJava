/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kinh_doanh;

import java.util.ArrayList;
import java.util.Scanner;

public class ListPencil {
    ArrayList<Pencil> pencil = new ArrayList<>();
    
    public void PrintListPencil(String keyword) {
        for (Pencil x : pencil) {
            if (x.getTrademark().contains(keyword) || x.getName().contains(keyword) || x.getPrice().contains(keyword) || x.getColor().contains(keyword) || x.getMaterial().contains(keyword) || x.getStiffness().contains(keyword)) {
                x.printPencil();
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
        String Name, Price, Trademark, Color, Material, Stiffness;
        System.out.print("Name: "); Name=sc.nextLine();
        System.out.print("Price: "); Price=sc.nextLine();
        System.out.print("Trademark: "); Trademark=sc.nextLine();
        System.out.print("Color: "); Color=sc.nextLine();
        System.out.print("Material: "); Material=sc.nextLine();
        System.out.print("Stiffness: "); Stiffness=sc.nextLine();
        Pencil newPencil = new Pencil(Name, Price, Trademark, Color, Material, Stiffness);
        pencil.add(newPencil);
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
                x.printPencil();
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
                x.printPencil();
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
