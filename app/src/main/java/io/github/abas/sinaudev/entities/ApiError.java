package io.github.abas.sinaudev.entities;

import java.util.List;
import java.util.Map;

/**
 * Created by user on 23/02/2018.
 */

public class ApiError {
    String message;
    Map<String, List<String>> errors;

    public Map<String, List<String>> getErrors() {
        return errors;
    }

    public String getMessage() {
        return message;
    }
}
