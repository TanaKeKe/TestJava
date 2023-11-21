/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kinh_doanh;

import java.util.ArrayList;
import java.util.Scanner;

public class ListNoteBook {
    ArrayList<NoteBook> notebook = new ArrayList<>();

    // in 1 cuốn sách theo dạng list
    public void PrintNoteBook(NoteBook x) {
        System.out.println("Name: " + x.getName());
        System.out.println("Price: " + x.getPrice());
        System.out.println("Trademark: " + x.getTrademark());
        System.out.println("Number Of Pages: " + x.getNumberOfPages());
        System.out.println("Type " + x.getType());
        System.out.println("Color: " + x.getColor());
        System.out.println("Material: " + x.getMaterial());
        System.out.println("Size: " + x.getSize());
        System.out.println("------");
    }

    // in nhiều cuốn sách có xâu kí tự đầu vào
    public void PrintListNoteBook(String keyword) {
        for (NoteBook x : notebook) {
            if (x.getTrademark().contains(keyword) || x.getName().contains(keyword) || x.getPrice().contains(keyword) || x.getNumberOfPages().contains(keyword) || x.getType().contains(keyword) || x.getColor().contains(keyword) || x.getMaterial().contains(keyword) || x.getSize().contains(keyword)) {
                PrintNoteBook(x);
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
        NoteBook x = new NoteBook();
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
        
        System.out.print("Number Of Pages: ");
        tmpString = sc.nextLine();
        x.setNumberOfPages(tmpString);

        System.out.print("Type: ");
        tmpString = sc.nextLine();
        x.setType(tmpString);

        System.out.print("Color: ");
        tmpString = sc.nextLine();
        x.setColor(tmpString);

        System.out.print("Material: ");
        tmpString = sc.nextLine();
        x.setMaterial(tmpString);

        System.out.print("Size: ");
        tmpString = sc.nextLine();
        x.setSize(tmpString);

        notebook.add(x);
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
                PrintNoteBook(x);
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
                PrintNoteBook(x);
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
