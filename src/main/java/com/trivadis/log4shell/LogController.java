package com.trivadis.log4shell;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    private static final Logger logger = LogManager.getLogger();

    @GetMapping("/")
    public String logIt(@RequestParam("user") String user) {
        logger.info("User: " + user);
        return "OK";
    }
}
