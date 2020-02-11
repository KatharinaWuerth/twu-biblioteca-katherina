package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MenuTest {
    private ByteArrayOutputStream outputStream;
    private PrintStream actual = System.out;

    @Before
    public void shouldHappenBeforeEveryTest() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void shouldBeAbleToPrintAllMenuOption() {
        String menuOption = "1. List of Books\n2. Quit Biblioteca\n";
        Menu.printAllMenuItems();
        assertEquals(menuOption, outputStream.toString());
    }

    @Test
    public void shouldSelectItemFromMenu() throws Exception {
        assertEquals("List of Books", Menu.selectItemFromMenu(1));
    }

/*
    @Test
    public void shouldShowAnErrorMessageIfWrongInputForMenuOption() throws Exception {
        String expectedMessage = "Please select a valid option";
        String actualMessage = Menu.selectItemFromMenu(6);
        assertTrue(actualMessage.contains(expectedMessage));
    }
*/

}
