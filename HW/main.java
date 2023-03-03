package Seminar6.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        notebook notebook1 = new notebook("Asus", "Windows", 16, 256,"black");
        notebook notebook2 = new notebook("Apple", "MacOS", 32, 512,"gold");
        notebook notebook3 = new notebook("Lenovo", "Windows", 16, 256,"black");
        notebook notebook4 = new notebook("HP", "Linux", 64, 512,"white");
        notebook notebook5 = new notebook("Honor", "Windows", 32, 1000,"silver");
        List<notebook> notebookList =new ArrayList<>(Arrays.asList(notebook1,notebook2,notebook3,notebook4,notebook5));
        System.out.println("Выберите фильтр поиска:");
        System.out.println("1 - Операционная система");
        System.out.println("2 - ОЗУ");
        System.out.println("3 - Жесткий диск");
        System.out.println("4 - Цвет");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Введите необходимую ОС");
                String os = scanner1.nextLine().toLowerCase();
                System.out.println("По вашему запросу найдено:");
                for (Seminar6.HW.notebook notebook : notebookList) {
                    if (os.equals(notebook.getOs().toLowerCase())) {
                        System.out.println(notebook.strnote());
                    }
                }
                scanner1.close();
                break;
            case 2:
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Введите необходимое кол-во ОЗУ");
                int ram = scanner2.nextInt();
                System.out.println("По вашему запросу найдено:");
                for (Seminar6.HW.notebook notebook : notebookList) {
                    if (ram <= 16) {
                        if (notebook.getRam() <= 16) {
                            System.out.println(notebook.strnote());
                        }
                    }
                    else if (ram<=32){
                        if (notebook.getRam() >16 && notebook.getRam() <= 32) {
                            System.out.println(notebook.strnote());
                        }
                    }
                    else if(ram <=64){
                        if (notebook.getRam() >32 && notebook.getRam() <= 64) {
                            System.out.println(notebook.strnote());
                        }
                    }
                }
                scanner2.close();
                break;
            case 3:
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Введите необходимое кол-во памяти");
                int ssd = scanner3.nextInt();
                System.out.println("По вашему запросу найдено:");
                for (Seminar6.HW.notebook notebook : notebookList) {
                    if (ssd <= 256) {
                        if (notebook.getSsd() <= 256) {
                            System.out.println(notebook.strnote());
                        }
                    }
                    else if (ssd<=512){
                        if (notebook.getSsd() >256 && notebook.getSsd() <= 512) {
                            System.out.println(notebook.strnote());
                        }
                    }
                    else if(ssd <=1000){
                        if (notebook.getSsd() >512 && notebook.getSsd() <= 1000) {
                            System.out.println(notebook.strnote());
                        }
                    }
                }
                scanner3.close();
                break;
            case 4:
                Scanner scanner4 = new Scanner(System.in);
                System.out.println("Введите необходимый цвет");
                String cl = scanner4.nextLine().toLowerCase();
                System.out.println("По вашему запросу найдено:");
                for (Seminar6.HW.notebook notebook : notebookList) {
                    if (cl.equals(notebook.getColor().toLowerCase())) {
                        System.out.println(notebook.strnote());
                    }
                }
                scanner4.close();
                break;
        }
        scanner.close();
    }
}
