package com.vishal.authService.users;

import com.vishal.sharedlib.common.CommonConstants;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import com.vishal.sharedlib.common.RestServiceTemplateUtils;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/ping")
    public Map<String, Object> ping(final HttpServletResponse response) {
        final Map<String, Object> map = new HashMap<>();
        return RestServiceTemplateUtils.getPingMessage(CommonConstants.AUTH, map, response);
    }
}
