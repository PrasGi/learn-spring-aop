package core.service;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class HelloService {
    public String hello(String name) {
        log.info("Call hello service.hello()");
        return "Hello " + name;
    }

    public String bye(String name) {
        log.info("Call bye service.bye()");
        return "bye " + name;
    }
}
