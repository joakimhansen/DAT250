package no.hvl.dat250.Experiment2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class app {
    @GetMapping("/")
    String home() {
        return "Hello, World!";
    }
}