package pl.swapi.client.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.swapi.client.dto.films.FilmListElementDto;
import pl.swapi.client.services.SwapiService;

import java.util.List;

/**
 * @author Daniel Krogulec
 */
@RestController
public class FilmController {
    private final SwapiService swapiService;

    @Autowired
    public FilmController(SwapiService swapiService) {
        this.swapiService = swapiService;
    }

    @RequestMapping(path = "/films/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity filmsList() {
        List<FilmListElementDto> filmListElementDtos = swapiService.filmsList();
        return ResponseEntity.ok(filmListElementDtos);
    }
}
