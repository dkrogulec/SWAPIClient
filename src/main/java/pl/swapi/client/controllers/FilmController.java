package pl.swapi.client.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.swapi.client.dto.HelloDto;

/**
 * @author Daniel Krogulec
 */
@RestController
public class FilmController {

    @RequestMapping(path = "/films/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity filmsList() {
        return ResponseEntity.ok(new HelloDto());
    }
}
