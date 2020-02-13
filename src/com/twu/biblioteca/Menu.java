package com.twu.biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private static String[] menu = new String[]{"List of Books", "List of Movies", "Checkout Book", "Return Book", "Quit Biblioteca"};

    public static void printAllMenuItems() {
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + 1 + ". " + menu[i]);
        }
    }

    public static String selectItemFromMenu(int listNumber) throws MenuItemNotAvailableException {
        if (listNumber < 1 || listNumber > menu.length) {
            throw new MenuItemNotAvailableException("Please select a valid option!");
        }
        return menu[listNumber - 1];

    }


    public static String selectMenu() {
        Scanner sc = new Scanner(System.in);
        printAllMenuItems();
        System.out.println("To select a menu item please enter the corresponding number");
        try {
            int inputNumber = sc.nextInt();
            try {
                return selectItemFromMenu(inputNumber);
            } catch (MenuItemNotAvailableException e) {
                System.out.println(e.getMessage());
                return selectMenu();
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number");
            return selectMenu();
        }

    }

}

