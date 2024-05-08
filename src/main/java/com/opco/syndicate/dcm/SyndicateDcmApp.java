package com.opco.syndicate.dcm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 *
 * @author taoy
 */
@SpringBootApplication
@EnableAsync
public class SyndicateDcmApp {

    public static void main(String[] args) {
        SpringApplication.run(SyndicateDcmApp.class, args);
    }

}
