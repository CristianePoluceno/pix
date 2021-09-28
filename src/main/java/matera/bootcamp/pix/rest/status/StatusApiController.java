package matera.bootcamp.pix.rest.status;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusApiController {

    @GetMapping("/api/v1/status")
//  Pode ser o de cima ou o de baixo é equivalente
//  @RequestMapping(value = "/api/v1/status", method = RequestMethod.GET)
    public String statusCheck(){
        return "up";
    }
}
