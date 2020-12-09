package com.company.menu;

import com.company.menu.actions.MenuActions;

import java.util.Scanner;

public class Menu {
    private MenuActions[] actions;
    private Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public Menu(MenuActions[] actions, Scanner scanner) {
        this.actions = actions;
        this.scanner = scanner;
    }

    public void run() {
        while (true) {
            showMenu();
            int choice = getMenuIndexFromUser();
            if (!validateMenuIndex(choice)) {
                System.out.println("Invalid input");
                continue;
            }
            String userString = getUserString();
            if (!validateUserString(userString)){
                System.out.println("Invalid string");
                continue;
            }

                actions[choice].doAction(userString);
            if (actions[choice].closeAfter()) break;
        }
    }

    private boolean validateUserString(String userString) {
        char[] chars = userString.toCharArray();
        for (char c : chars) {
            if (!Character.isAlphabetic(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean validateMenuIndex(int choice) {
        return choice >= 0 && choice < actions.length;
    }

    private int getMenuIndexFromUser() {
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice - 1;
    }

    private String getUserString() {
        System.out.println("Enter your string: ");
        String choice = scanner.nextLine();

        return choice;
    }

    private void showMenu() {
        for (int i = 0; i < actions.length; i++) {

            System.out.printf("%d - %s\n" , (i + 1) , actions[i].getName());
        }

    }

}

