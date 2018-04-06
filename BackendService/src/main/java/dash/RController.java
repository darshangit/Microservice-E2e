package dash;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class RController {

    @RequestMapping(value= "/get/backend")
    public String available() {
        return "Got Backend Value";
    }
}
