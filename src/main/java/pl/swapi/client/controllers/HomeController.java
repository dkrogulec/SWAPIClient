package pl.swapi.client.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.swapi.client.dto.WelcomeDto;

/**
 * @author Daniel Krogulec
 */
@RestController
public class HomeController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ResponseEntity hello() {
        return ResponseEntity.ok(WelcomeDto.produceWelcomeDto());
    }
}
