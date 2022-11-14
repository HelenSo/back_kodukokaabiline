package ee.valiit.backkodukokaabiline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello/world")
    public String helloWorld() {
        return "HELLO WOOOOORLD!!! YEE!";
    }
}
