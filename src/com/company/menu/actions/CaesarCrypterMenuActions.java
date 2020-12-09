package com.company.menu.actions;

import com.company.crypter.CaesarSymbolCrypter;
import com.company.crypter.StringCrypter;

import java.util.Scanner;

public class CaesarCrypterMenuActions implements MenuActions {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void doAction(String string) {
        int offset = getOffset();
        StringCrypter stringCrypter = new StringCrypter(new CaesarSymbolCrypter(offset));
        System.out.println(stringCrypter.cryptString(string));

    }

    @Override
    public String getName() {
        return "to crypt your string using Caesar Cipher";
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

    private int getOffset(){
        System.out.println("Enter your offset: ");
        int offset = scanner.nextInt();
        scanner.nextLine();
        return offset ;

    }
}
