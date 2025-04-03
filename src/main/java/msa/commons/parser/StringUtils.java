package msa.commons.parser;

public class StringUtils {
    private StringUtils() {}

    public static String getString(Object obj){
        if (obj == null) 
            return "";
        
        if (obj instanceof String s)
            return s;

        return obj.toString();
    }
}
