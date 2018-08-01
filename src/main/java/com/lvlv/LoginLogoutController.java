package com.lvlv;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/auth")
@Controller
public class LoginLogoutController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@RequestParam(value = "error", required = false) boolean error, ModelMap model) {
        if (error) {
            model.put("error", "用户名或密码错误");
        } else {
            model.put("error", "");
        }
        return "jsp/login";
    }

    @RequestMapping(value = "denied", method = RequestMethod.GET)
    public String denied() {
        return "jsp/accessDenied";
    }
}
