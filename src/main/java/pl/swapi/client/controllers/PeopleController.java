package pl.swapi.client.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.swapi.client.dto.people.PeopleListElementDto;
import pl.swapi.client.services.SwapiService;

import java.util.List;

/**
 * @author Daniel Krogulec
 */
@RestController
public class PeopleController {
    private final SwapiService service;

    @Autowired
    public PeopleController(SwapiService service) {
        this.service = service;
    }

    @RequestMapping(path = "/people/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity peopleList() {
        List<PeopleListElementDto> peopleListElementDtos = service.peopleList();
        return ResponseEntity.ok(peopleListElementDtos);
    }
}
