package com.company.menu.actions;

import com.company.crypter.SymbolCrypter;

public interface MenuActions {

    void doAction(String string);

    String getName();

    boolean closeAfter();
}
