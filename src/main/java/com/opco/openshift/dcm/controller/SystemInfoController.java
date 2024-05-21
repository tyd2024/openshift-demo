package com.opco.syndicate.dcm.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author taoy
 */
@RestController
public class SystemInfoController {


    @RequestMapping(path = "/systemInfo", method = RequestMethod.GET)
    public String status() {
        return "Success";
    }
    
}