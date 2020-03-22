package com.twu.biblioteca.textui;

public class WelcomeState implements TextUIState {
    @Override
    public String name() {
        return "Welcome State";
    }

    @Override
    public void onEnterState() {
        String message = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        System.out.println(message);
    }

    @Override
    public boolean takesInput() {
        return false;
    }

    @Override
    public TextUIState interpret(String input) {
        return new MenuState();
    }
}
