package com.sunnymix.openapiquery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunnymix
 */
@RestController
public class IndexController {

    @GetMapping
    public String index() {
        return "index";
    }

}
