package demo;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-demo1", fallback = Demo1ClientFallback.class)
public interface Demo1Client {

    @GetMapping("/getInfo")
    String getInfo();

}
