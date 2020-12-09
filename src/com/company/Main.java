package com.company;

import com.company.menu.Menu;
import com.company.menu.actions.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuActions[] menuActions = {new CaesarCrypterMenuActions(), new CaesarUncrypterMenuActions(),
                new XorCrypterMenuActions(), new XorUncrypterMenuActions()};
        Menu menu = new Menu(menuActions,scanner);
        menu.run();
    }
}
