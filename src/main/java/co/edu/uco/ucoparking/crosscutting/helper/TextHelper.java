package co.edu.uco.ucoparking.crosscutting.helper;

public final class TextHelper {

    private static final String EMPTY = "";

    private TextHelper() {
    }

    public static boolean isNull(String value) {
        return value == null;
    }

    public static boolean isBlank(String value) {
        return isNull(value) || value.isBlank();
    }

    public static boolean isBelowMinLength(String value, int min) {
        return isNull(value) || value.length() < min;
    }

    public static boolean exceedsMaxLength(String value, int max) {
        return isNull(value) || value.length() > max;
    }

    public static boolean doesNotMatchPattern(String value, String pattern) {
        return isNull(value) || !value.matches(pattern);
    }

    public static String clean(String value) {
        return isNull(value) ? EMPTY : value.trim();
    }

    public static String cleanAndUpperCase(String value) {
        return isNull(value) ? EMPTY : value.trim().toUpperCase();
    }

    public static String cleanAndLowerCase(String value) {
        return isNull(value) ? EMPTY : value.trim().toLowerCase();
    }
}
