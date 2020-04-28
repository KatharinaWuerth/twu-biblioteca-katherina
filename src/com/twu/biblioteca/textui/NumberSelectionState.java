package com.twu.biblioteca.textui;

public abstract class NumberSelectionState implements TextUIState {

    protected abstract int getSizeOfArray();

    protected abstract TextUIState interpret(int selectedIndex);

    public final TextUIState interpret(String input) throws MenuItemNotAvailableException {
        try {
            int i = Integer.parseInt(input);
            if (i < 1 || i > getSizeOfArray()) {
                throw new MenuItemNotAvailableException("");
            }
            return interpret(i);
        } catch (NumberFormatException e) {
            throw new MenuItemNotAvailableException("");
        }
    }

}
