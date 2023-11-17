/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kinh_doanh;

import java.util.ArrayList;
import java.util.Scanner;

public class ListPen {
    ArrayList<Pen> pen = new ArrayList<>();

    public void PrintPen(Pen x) {
        System.out.println("Name: " + x.getName());
        System.out.println("Price: " + x.getPrice());
        System.out.println("Trademark: " + x.getTrademark());
        System.out.println("Color: " + x.getColor());
        System.out.println("Material: " + x.getMaterial());
        System.out.println("Type of Ink: " + x.getTypeOfInk());
        System.out.println("Smoothly: " + x.getSmoothly());
        System.out.println("------");
    }
    
    public void PrintListPen(String keyword) {
        for (Pen x : pen) {
            if (x.getTrademark().contains(keyword) || x.getName().contains(keyword) || x.getPrice().contains(keyword) || x.getColor().contains(keyword) || x.getMaterial().contains(keyword) || x.getTypeOfInk().contains(keyword) || x.getSmoothly().contains(keyword)) {
                PrintPen(x);
            }
        }
    }

    public void PrintTablePen(String keyword) {
        for (Pen x : pen) {
            if (x.getTrademark().contains(keyword) || x.getName().contains(keyword) || x.getPrice().contains(keyword) || x.getColor().contains(keyword) || x.getMaterial().contains(keyword) || x.getTypeOfInk().contains(keyword) || x.getSmoothly().contains(keyword)) {
                System.out.printf("|%-15s|%-12s|%-30s|- Color: %-30s\n",x.getName(),x.getPrice(),x.getTrademark(),x.getColor());
                System.out.printf("|               |            |                              |- Material: %-30s\n",x.getMaterial());
                System.out.printf("|               |            |                              |- Type of Ink: %-30s\n",x.getTypeOfInk());
                System.out.printf("|               |            |                              |- Smoothly: %-30s\n",x.getSmoothly());
                System.out.println("|---------------|------------|------------------------------|------------------------------");
            }
        }
    }
    
    // thêm sách
    public void AddPen() {
        System.out.println("Please enter the following information!");
        Scanner sc = new Scanner(System.in);
        Pen x = new Pen();
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

        System.out.print("Type Of Ink: ");
        tmpString = sc.nextLine();
        x.setTypeOfInk(tmpString);

        System.out.print("Smoothly: ");
        tmpString = sc.nextLine();
        x.setSmoothly(tmpString);
        
        pen.add(x);
        System.out.println("Added pens successfully!");
    }

    // sửa sách
    public void FixPen() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the pen you want to edit: ");
        String namepen = sc.nextLine();
        int count = 0;
        for (Pen x : pen) {
            if (x.getName().equals(namepen)) {
                // in tư liệu thêm code dạng list vào đây
                PrintPen(x);
                System.out.print("Is this the pen you want to edit? (y/n): ");
                String check = sc.nextLine();
                if ("y".equals(check)) {
                    count = 1;
                    System.out.print("Which function do you want to edit? (name, price,trademark,color ,material,typeofink, smoothly): ");
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
                    } else if (namefunction.equals("typeofink")) {
                        String tmp = sc.nextLine();
                        x.setTypeOfInk(tmp);
                    } else if (namefunction.equals("smoothly")) {
                        String tmp = sc.nextLine();
                        x.setSmoothly(tmp);
                    }
                    System.out.println("Successfully edited the pens!");
                }
            }
        }

        if (count == 0) {
            System.out.println("Pens do not exist!");
        }
    }

    public void DeletePen() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the pen you want to edit: ");
        String namepen = sc.nextLine();
        int count = 0;
        for (Pen x : pen) {
            if (x.getName().equals(namepen)) {
                // in tư liệu thêm code dạng list vào đây
                PrintPen(x);
                System.out.print("Is this the pen you want to delete? (y/n): ");
                String check = sc.nextLine();
                if ("y".equals(check)) {
                    count = 1;
                    pen.remove(x);
                    System.out.println("Successfully deleted the pens!");
                }
            }
        }

        if (count == 0) {
            System.out.println("Pens do not exist!");
        }
    }
}
