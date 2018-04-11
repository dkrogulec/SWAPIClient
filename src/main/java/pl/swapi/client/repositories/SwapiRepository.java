package pl.swapi.client.repositories;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.swapi.client.dto.films.FilmsListDto;
import pl.swapi.client.dto.people.PeopleListDto;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Daniel Krogulec
 */
@FeignClient(name = "swapi", url = "https://swapi.co/api")
public interface SwapiRepository {

    @RequestMapping(path = "/films", method = GET)
    ResponseEntity<FilmsListDto> filmsList();

    @RequestMapping(path = "/people", method = GET)
    ResponseEntity<PeopleListDto> peopleList();
}
