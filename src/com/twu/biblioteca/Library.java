package com.twu.biblioteca;

import com.sun.xml.internal.bind.v2.TODO;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;


public class Library {
    private static ArrayList<Book> bookLists;

    public Library(Book... books) {
        bookLists = new ArrayList<Book>(Arrays.asList(books));
    }

    public void printBookList() {
        for (int i = 0; i < bookLists.size(); i++) {
            System.out.println(i + 1 + ". " + bookLists.get(i).displayBook());
        }
    }

    public static Book checkoutTheSelectedBook(int selectedNumber, Library lib) {
        for (int i = 0; i < bookLists.size(); i++) {
            if(selectedNumber < 0 || selectedNumber > bookLists.size() ) {
                System.out.println("Sorry, that book is not available");
                return null;
            }
            System.out.println("Thank you! Enjoy the book");
            return bookLists.remove(selectedNumber - 1);
        }
        return null;
    }

    public static Book showNewBookListWithAvailableBooks(Library lib) {
        Scanner sc = new Scanner(System.in);
        BibliotecaApp.bookLists.printBookList();
        System.out.println("To select a book for checkout please enter the book nr.");
        int inputNumber = sc.nextInt();
        return checkoutTheSelectedBook(inputNumber, lib);
    }

}

;
