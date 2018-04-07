package dash;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class RController {

    String a = null;
    @RequestMapping(value= "/get/backend")
    public String available() {

        a.equals("s");

        return "Got Backend Value";
    }
}
