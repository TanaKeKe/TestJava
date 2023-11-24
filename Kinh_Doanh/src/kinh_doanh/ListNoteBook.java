/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kinh_doanh;

import java.util.ArrayList;
import java.util.Scanner;

public class ListNoteBook {
    ArrayList<NoteBook> notebook = new ArrayList<>();

    // in nhiều cuốn sách có xâu kí tự đầu vào
    public void PrintListNoteBook(String keyword) {
        for (NoteBook x : notebook) {
            if (x.getTrademark().contains(keyword) || x.getName().contains(keyword) || x.getPrice().contains(keyword) || x.getNumberOfPages().contains(keyword) || x.getType().contains(keyword) || x.getColor().contains(keyword) || x.getMaterial().contains(keyword) || x.getSize().contains(keyword)) {
                x.printNoteBook();
            }
        }
    }

    // in nhiều cuốn theo bảng
    public void PrintTableNoteBook(String keyword) {
        for (NoteBook x : notebook) {
            if (x.getTrademark().contains(keyword) || x.getName().contains(keyword) || x.getPrice().contains(keyword) || x.getNumberOfPages().contains(keyword) || x.getType().contains(keyword) || x.getColor().contains(keyword) || x.getMaterial().contains(keyword) || x.getSize().contains(keyword)) {
                System.out.printf("|%-15s|%-12s|%-30s|- Number Of Pages: %-30s\n",x.getName(),x.getPrice(),x.getTrademark(),x.getNumberOfPages());
                System.out.printf("|               |            |                              |- Type: %-30s\n",x.getType());
                System.out.printf("|               |            |                              |- Color: %-30s\n",x.getColor());
                System.out.printf("|               |            |                              |- Material: %-30s\n",x.getMaterial());
                System.out.printf("|               |            |                              |- Size: %-30s\n",x.getSize());
                System.out.println("|---------------|------------|------------------------------|------------------------------");
            }
        }
    }
    
    // thêm sách
    public void AddNoteBook() {
        System.out.println("Please enter the following information!");
        Scanner sc = new Scanner(System.in);
        String Name, Price, Trademark, NumberOfPages, Type, Color, Material, Size;
        System.out.print("Name: "); Name=sc.nextLine();
        System.out.print("Price: "); Price=sc.nextLine();
        System.out.print("Trademark: "); Trademark=sc.nextLine();
        System.out.print("Number Of Pages: "); NumberOfPages=sc.nextLine();
        System.out.print("Type: "); Type=sc.nextLine();
        System.out.print("Color: "); Color=sc.nextLine();
        System.out.print("Material: "); Material=sc.nextLine();
        System.out.print("Size: "); Size=sc.nextLine();
        NoteBook newNoteBook = new NoteBook(Name, Price, Trademark, NumberOfPages, Type, Color, Material, Size);
        notebook.add(newNoteBook);
        System.out.println("Added notebooks successfully!");
    }

    // sửa sách
    public void FixNoteBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the notebook you want to edit: ");
        String namenotebook = sc.nextLine();
        int count = 0;
        for (NoteBook x : notebook) {
            if (x.getName().equals(namenotebook)) {
                // in tư liệu thêm code dạng list vào đây
                x.printNoteBook();
                System.out.print("Is this the notebook you want to edit? (y/n): ");
                String check = sc.nextLine();
                if ("y".equals(check)) {
                    count = 1;
                    System.out.print("Which function do you want to edit? (name, price,trademark,number of pages ,type ,color ,material, size): ");
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
                    } else if (namefunction.equals("number of pages")) {
                        String tmp = sc.nextLine();
                        x.setNumberOfPages(tmp);
                    } else if (namefunction.equals("type")) {
                        String tmp = sc.nextLine();
                        x.setType(tmp);
                    } else if (namefunction.equals("color")) {
                        String tmp = sc.nextLine();
                        x.setColor(tmp);
                    } else if (namefunction.equals("material")) {
                        String tmp = sc.nextLine();
                        x.setMaterial(tmp);
                    } else if (namefunction.equals("size")) {
                        String tmp = sc.nextLine();
                        x.setSize(tmp);
                    }
                    System.out.println("Successfully edited the notebook!");
                }
            }
        }

        if (count == 0) {
            System.out.println("NoteBooks do not exist!");
        }
    }

    public void DeleteNoteBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the notebook you want to edit: ");
        String namenotebook = sc.nextLine();
        int count = 0;
        for (NoteBook x : notebook) {
            if (x.getName().equals(namenotebook)) {
                // in tư liệu thêm code dạng list vào đây
                x.printNoteBook();
                System.out.print("Is this the notebook you want to delete? (y/n): ");
                String check = sc.nextLine();
                if ("y".equals(check)) {
                    count = 1;
                    notebook.remove(x);
                    System.out.println("Successfully deleted the notebook!");
                }
            }
        }

        if (count == 0) {
            System.out.println("NoteBooks do not exist!");
        }
    }
}
