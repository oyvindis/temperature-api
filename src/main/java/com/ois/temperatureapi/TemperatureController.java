package com.ois.temperatureapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {

    @RequestMapping("/")
    public String index() {
        return "Congratulations from TemperatureController.java";
    }

}
