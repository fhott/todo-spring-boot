package app.stringjoin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StringJoinerExampleController {

    @GetMapping("/string-join")
    public String join(
            @RequestParam(value="stringToJoin") List<String> stringToJoin,
            @RequestParam(value="delimiter") CharSequence delimiter,
            @RequestParam(value="prefix") CharSequence prefix,
            @RequestParam(value="suffix") CharSequence suffix
    ) {
        return StringJoinerExample.join(stringToJoin, delimiter, prefix, suffix);
    }

}
