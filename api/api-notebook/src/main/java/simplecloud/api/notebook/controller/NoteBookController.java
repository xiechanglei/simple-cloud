package simplecloud.api.notebook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notebook")
public class NoteBookController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
