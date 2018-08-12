package demo;

import org.springframework.stereotype.Component;

@Component
public class Demo1ClientFallback implements Demo1Client {
    @Override
    public String getInfo() {
        return "fallback demo1";
    }
}
