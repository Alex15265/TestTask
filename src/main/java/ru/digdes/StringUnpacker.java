package ru.digdes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUnpacker {
    private static final String MAIN_CONTROL_PATTERN = "\\d+\\[[a-zA-Z]+\\]";
    private static final String SECONDARY_CONTROL_PATTERN = "\\d+";

    public void unpack(String unpackableString) {
        Pattern secondaryPattern = Pattern.compile(SECONDARY_CONTROL_PATTERN);
        Matcher matcher = secondaryPattern.matcher(unpackableString);
        while (matcher.find()) {
            unpackableString = simplify(unpackableString);
        }
        System.out.println("Unpacked String: " + unpackableString);
    }

    private String simplify(String unpackableString) {
        Pattern mainPattern = Pattern.compile(MAIN_CONTROL_PATTERN);
        Matcher matcher = mainPattern.matcher(unpackableString);
        matcher.find();
        String substring = unpackableString.substring(matcher.start(),matcher.end());
        String[] splittedSubstring = substring.replaceAll("\\]", "").split("\\[");
        String unpackedSubstring = new String(
                new char[Integer.parseInt(splittedSubstring[0])]).replace("\0", splittedSubstring[1]);
        return matcher.replaceFirst(unpackedSubstring);
    }
}
