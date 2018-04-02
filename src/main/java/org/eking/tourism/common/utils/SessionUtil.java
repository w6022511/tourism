package org.eking.tourism.common.utils;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class SessionUtil {

    @GetMapping("/getSession")
    public String getSession(HttpServletRequest request){
        String param = request.getParameter("param");
        return request.getSession().getAttribute(param).toString();
    }
}
