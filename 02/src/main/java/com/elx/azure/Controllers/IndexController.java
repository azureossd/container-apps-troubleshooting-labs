package com.elx.azure.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
    public String index() {
        String msg = "container-apps-elx-labs-02";

        return msg;
    }
}
