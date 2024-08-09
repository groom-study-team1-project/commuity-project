package deepdivers.commuity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DemoController {

    @PostMapping("/demo")
    public ResponseEntity<String> Post() {
        String okay = "Hello World!!!!";
        return new ResponseEntity<>(okay, HttpStatus.OK);
    }
}
