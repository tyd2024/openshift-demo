package com.opco.syndicate.dcm.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author taoy
 */
@RestController
public class SystemInfoController {
    @Value("${testing}")
    String testing;

    @RequestMapping(path = "/systemInfo", method = RequestMethod.GET)
    public String status() {
        return "testing branch: Success " + testing;
    }
    
}
