package msa.commons.utils;

import java.time.LocalDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import msa.commons.utils.gsonadapters.LocalDateTimeAdapter;

public class GsonUtils {
    private static final Gson instance = new GsonBuilder()
                                            .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter())
                                            .create();
    private GsonUtils() {}

    public static Gson getInstance() {
        return instance;
    }
}
