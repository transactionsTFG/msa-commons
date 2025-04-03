package msa.commons.parser;

public class NumberParser {
    private NumberParser() {}

    public static long toLong(Object data) {
        if(data instanceof Number n)
            return n.longValue();
        throw new IllegalArgumentException("Cannot convert to long: " + data);
    }
}
