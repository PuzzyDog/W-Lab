package w.lab.web.toy.website.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by weixuecai on 2018/2/1
 */
@RestController
@RequestMapping("/toy/web")
public class PingController {

    @RequestMapping("/ping")
    public String ping() {
        return "pong";
    }

}
