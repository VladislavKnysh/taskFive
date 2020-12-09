package com.company.crypter;

public class XorSymbolCrypter implements SymbolCrypter {

    private String key;

    public XorSymbolCrypter(String key) {
        this.key = key;
    }

    @Override
    public char crypt(char c) {
        byte charC = (byte) c;
        byte keyByte = (byte) key.charAt(0);
        int res = charC ^ keyByte;
        return (char) res;
    }

    @Override
    public char uncrypt(char c) {
        byte charC = (byte) c;
        byte keyByte = (byte) key.charAt(0);
        int res = charC ^ keyByte;
        return (char) res;
    }

}
