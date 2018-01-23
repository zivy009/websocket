package com.zivy.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zivy
 * @date 2018年1月23日
 * @describe
 */
@Controller
@RequestMapping("/socket")
public class WebSocketTestController {

    @RequestMapping(value = "test")
    @ResponseBody
    protected String name() {
        return "ok";
    }

    @RequestMapping(value = "test2")
    protected String test2() {
        return "test/socket";
    }
}
