package app.hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class RaunyController {

    private static final String oRauny = "Oooooooooo Rauny!";

    @GetMapping("/rauny")
    public Rauny rauny(@RequestParam(value="voltaVersao", defaultValue="false") Boolean voltaVersao) {
        if(voltaVersao){
            return new Rauny(oRauny + " VOLTA VERSÃO RAUNY!!");
        } else {
            return new Rauny(oRauny);
        }
    }
}
