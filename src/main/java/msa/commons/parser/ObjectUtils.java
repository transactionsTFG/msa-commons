package msa.commons.parser;

public class ObjectUtils {
    private ObjectUtils() {}

    public static String getString(Object obj){
        if (obj == null) 
            return "";
        
        if (obj instanceof String s)
            return s;

        return obj.toString();
    }

    public static <T> boolean isInstanceOf(Object obj, Class<T> type) {
        if (type == null) 
            return false;
        return type.isInstance(obj);
    }

    public static <T> T safeCast(Object obj, Class<T> type) {
        return type.isInstance(obj) ? type.cast(obj) : null;
    }

}
