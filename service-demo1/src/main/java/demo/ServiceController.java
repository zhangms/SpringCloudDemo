package demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo1")
public class ServiceController {

    @GetMapping("/getInfo")
    public String getInfo() {
        return "hello demo1";
    }

}
