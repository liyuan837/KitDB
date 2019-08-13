package top.thinkin.lightd.exception;

import java.util.*;
import java.util.stream.Collectors;

public enum ErrorType {

    RETAIN_KEY(0, "RETAIN_KEY");

    private final String type;
    static final Set<String> ALL;
    static {
        ErrorType[] errorTypes =   ErrorType.values();
        ALL = Arrays.stream(errorTypes).map(e->e.type).collect(Collectors.toSet());
    }
    ErrorType(int key, String type ) {
        this.type = type;
    }

    public static boolean contains(String type){
        return ALL.contains(type);
    }
}