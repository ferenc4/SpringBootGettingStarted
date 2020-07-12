package hello.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import hello.models.SampleIn;
import hello.models.SampleOut;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class HelloController {

    public final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/sample_post", method = RequestMethod.POST)
    public String samplePost(@RequestBody String rawBody) throws IOException {
        SampleIn sampleIn = OBJECT_MAPPER.readValue(rawBody, SampleIn.class);
        return OBJECT_MAPPER.writeValueAsString(new SampleOut(String.format(
                "I found %d %s", sampleIn.getFruitCount(), sampleIn.getFruitTypePlural()
        )));
    }

}
