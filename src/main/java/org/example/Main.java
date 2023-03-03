package org.example;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    public static void main(String[] args) {
        log.info("Hello {}", "world!");
        log.debug("Hello {}", "world!");
        log.trace("Hello {}", "world!");
        log.error("Hello {}", "world!");
        log.warn("Hello {}", "world!");
    }
}