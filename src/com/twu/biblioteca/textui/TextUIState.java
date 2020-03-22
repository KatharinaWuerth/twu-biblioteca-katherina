package com.twu.biblioteca.textui;

public interface TextUIState {

    String name();

    void onEnterState();

    boolean takesInput();

    TextUIState interpret(String input) throws MenuItemNotAvailableException;

}
