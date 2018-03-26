import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Demo {

    @GetMapping("/demo")
    public String demo(){

        //System.err.println(map.get("a").toString());
        return "hello";
    }
}
