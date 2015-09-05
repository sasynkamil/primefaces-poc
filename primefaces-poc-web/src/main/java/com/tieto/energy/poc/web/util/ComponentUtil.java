package com.tieto.energy.poc.web.util;

/**
 * @author Kamil Sasyn (sasynkam)
 *         2015-06-12
 */
public class ComponentUtil {

    public static String convertToComponentId(final String label) {
        return label.replace(".", "_");
    }

    public static String convertToLabel(final String label) {
        final int i = label.lastIndexOf(".");
        return splitCamelToHuman(label.substring(i + 1));
    }

    private static String splitCamelToHuman(final String source) {
        StringBuilder target = new StringBuilder();
        boolean isFirstChar = true;
        for (int i = 0; i < source.length(); i++) {
            Character ch = source.charAt(i);
            if (Character.isUpperCase(ch)) {
                target.append(" ");
                if (isFirstChar) {
                    target.append(ch);
                    isFirstChar = false;
                } else {
                    target.append(Character.toLowerCase(ch));
                }
            } else {
                target.append(ch);
            }
        }
        return target.toString();
    }
}
