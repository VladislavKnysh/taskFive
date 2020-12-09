package com.company.menu.actions;

import com.company.crypter.StringCrypter;
import com.company.crypter.XorSymbolCrypter;

import java.util.Scanner;

public class XorCrypterMenuActions implements MenuActions {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void doAction(String string) {
        String key = getKey();
        StringCrypter stringCrypter = new StringCrypter(new XorSymbolCrypter(key));
        System.out.println(stringCrypter.cryptString(string));

    }

    @Override
    public String getName() {
        return "to crypt your string using XOR Cipher";
    }

    @Override
    public boolean closeAfter() {
        System.out.println("Do you want to close program?(1 - yes,2 - no)");

        switch (scanner.nextInt()) {
            case 1:
                return true;
            case 2:
                return false;
            default:
                System.out.println("Oh, no! Something went wrong.");
                System.out.println("Emergency termination of the program");
                return true;
        }
    }

    private String  getKey() {
        System.out.println("Enter your key: ");
        String key = scanner.nextLine();

        return key;

    }
}
