package wang.xpro.datamanage.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @Value("${name:}")
    private String name;

    @Value("${db:}")
    private String db;

    @Value("${mq:}")
    private String mq;

    @GetMapping("/hello")
    public String index() {
        return "Hello World!";
    }

    @GetMapping("/name")
    public String nameFromYamlConfig() {
        return name;
    }

    @GetMapping("/log")
    public String log() {
        log.info("db：" + db);
        log.info("mq：" + mq);
        return "";
    }

}
