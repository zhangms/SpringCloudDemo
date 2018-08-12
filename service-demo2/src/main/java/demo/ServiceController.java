package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo2")
public class ServiceController {

    @Autowired
    Demo1Client demo1Client;

    @GetMapping("/getInfo")
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("demo1：");
        sb.append(demo1Client.getInfo());
        sb.append("\n this is demo2");
        return sb.toString();
    }

}
