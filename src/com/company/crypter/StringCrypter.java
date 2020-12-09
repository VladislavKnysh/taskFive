package com.company.crypter;

public class StringCrypter {
    private SymbolCrypter symbolCrypter;
    StringBuilder result = new StringBuilder();

    public StringCrypter(SymbolCrypter symbolCrypter) {
        this.symbolCrypter = symbolCrypter;
    }

    public String cryptString(String string) {
        for (char c : string.toCharArray()) {
            char newChar = symbolCrypter.crypt(c);
            result.append(Character.toString(newChar));
        }
        return result.toString();
    }

    public String uncryptString(String string) {
        for (char c : string.toCharArray()) {
            char newChar = symbolCrypter.uncrypt(c);
            result.append(Character.toString(newChar));
        }
        return result.toString();
    }
}
