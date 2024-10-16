package com.vishal.sharedlib.common;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

public class RestServiceTemplateUtils {

    public static Map<String, Object> getPingMessage(String serviceName, final Object object,
                                                     final HttpServletResponse response) {
        response.setStatus(HttpStatus.OK.value());
        return response(HttpStatus.OK.value(), true, serviceName + " Service is working fine", object);
    }

    private static Map<String, Object> response(final int status, final boolean isSuccess, final String message,
                                                final Object object) {
        final Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("status", status);
        responseMap.put("isSuccess", isSuccess);
        responseMap.put("message", message);
        if (isSuccess) {
            responseMap.put("data", object);
        } else {
            responseMap.put("error", object);
        }
        return responseMap;
    }
}
