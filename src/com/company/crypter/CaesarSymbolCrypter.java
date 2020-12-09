package com.company.crypter;

public class CaesarSymbolCrypter implements SymbolCrypter{

    private int offset;

    public CaesarSymbolCrypter(int offset) {
        this.offset = offset;
    }

    @Override
    public char crypt(char c) {
        int newCharPosition = (c-'a'+offset)%26;
        return (char) ((char) newCharPosition+'a');
    }

    @Override
    public char uncrypt(char c) {
        int newCharPosition = (c-'a'+(26-offset%26))%26;
        return (char) ((char) newCharPosition+'a');
    }
}
