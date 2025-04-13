package msa.commons.utils;

import com.google.gson.Gson;

public class GsonUtils {
    private static final Gson instance = new Gson();
    private GsonUtils() {}

    public static Gson getInstance() {
        return instance;
    }
}
