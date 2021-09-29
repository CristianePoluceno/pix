package matera.bootcamp.pix.service;

import org.springframework.stereotype.Service;

/**
 * Essas anotações é pra o Spring controlar a classe
 * Component
 * @Controller
 * @RestController
 * @Service
 * Repository
*/

@Service
public class ContaCorrenteService {

    public String imprimeConta(){
        return "123";
    }

}

