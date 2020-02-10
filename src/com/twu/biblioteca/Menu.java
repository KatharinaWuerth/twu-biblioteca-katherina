package com.twu.biblioteca;
import java.util.Scanner;

public class Menu {

    private static String[] menu = new String[]{"List of Books"};

    public static void printAllMenuItems() {
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + 1 + ". " + menu[i]);
        }
    }

    public static String selectItemFromMenu(int listNumber) {
        if (listNumber < 1 || listNumber > menu.length ) {
            System.out.println("That is an invalid option");
        }
        return menu[listNumber-1];
    }


    public static String selectMenu() {
        Scanner sc = new Scanner(System.in);
        printAllMenuItems();
        System.out.println("To select a menu item please enter the corresponding number");
        int inputNumber = sc.nextInt();
        return selectItemFromMenu(inputNumber);
    }


}
