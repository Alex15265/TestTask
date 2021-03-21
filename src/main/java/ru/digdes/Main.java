package ru.digdes;

public class Main {
    public static void main(String[] args) {
        StringValidator stringValidator = new StringValidator();
        StringUnpacker stringUnpacker = new StringUnpacker();

        stringUnpacker.unpack(stringValidator.scanAndValidate());
    }
}
