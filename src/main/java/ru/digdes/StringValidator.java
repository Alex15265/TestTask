package ru.digdes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator {
    private static final String CONTROL_PATTERN = "(\\d+\\[([a-zA-Z]+|\\d+\\[[a-zA-Z]+\\][a-zA-Z]*)\\][a-zA-Z]*)+";

    public String scanAndValidate() {
        Scanner scanner = new Scanner(System.in);
        String inputString = null;
        boolean isValid = false;

        while(!isValid) {
            System.out.print("Input String: ");
            Pattern pattern = Pattern.compile(CONTROL_PATTERN);
            inputString = scanner.nextLine();
            Matcher matcher = pattern.matcher(inputString);
            isValid = matcher.matches();
            if (!isValid) System.out.println("Invalid format!");
        }
        return inputString;
    }
}
