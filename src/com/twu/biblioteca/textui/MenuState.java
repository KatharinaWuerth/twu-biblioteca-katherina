package com.twu.biblioteca.textui;

public class MenuState extends NumberSelectionState {


    private static TextUIState[] successors = new TextUIState[]{new ShowBooksState(), new ShowMoviesState(), new CheckoutBookState(), new CheckoutMovieState(), new ReturnBookState(), new ByeState()};

    public static void printAllMenuItems() {
        for (int i = 0; i < successors.length; i++) {
            System.out.println(i + 1 + ". " + successors[i].name());
        }
    }

    @Override
    public String name() {
        return null;
    }


    @Override
    public void onEnterState() {
        printAllMenuItems();
        System.out.println("To select a menu item please enter the corresponding number");
    }

    @Override
    public boolean takesInput() {
        return true;
    }


    @Override
    protected int getSizeOfArray() {
        return successors.length;
    }

    @Override
    protected TextUIState interpret(int selectedIndex) {
        return successors[selectedIndex - 1];
    }
}
