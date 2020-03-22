package com.twu.biblioteca.textui;

public class ByeState implements TextUIState {

    @Override
    public String name() {
        return "Quit Biblioteca";
    }

    @Override
    public void onEnterState() {
        System.out.println("Till next time!");
    }

    @Override
    public boolean takesInput() {
        return true;
    }

    @Override
    public TextUIState interpret(String input) {

        return null;
    }
}
