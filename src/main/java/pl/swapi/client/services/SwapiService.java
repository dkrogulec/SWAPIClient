package pl.swapi.client.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.swapi.client.dto.FilmListElementDto;
import pl.swapi.client.dto.FilmsListDto;
import pl.swapi.client.repositories.SwapiRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Daniel Krogulec
 */
@Service
public class SwapiService {

    private final SwapiRepository swapiRepository;
    private static final String SWAPI_FILM_PATH = "https://swapi.co/api/films/";

    @Autowired
    public SwapiService(SwapiRepository swapiRepository) {
        this.swapiRepository = swapiRepository;
    }

    public List<FilmListElementDto> filmsList() {
        return swapiRepository
                .filmsList()
                .getBody()
                .getFilms()
                .stream()
                .peek(it -> {
                    String sourceUrl = it.getUrl();
                    String res = sourceUrl.replace(SWAPI_FILM_PATH, "myURL/");
                    it.setUrl(res);
                })
                .sorted(Comparator.comparing(FilmListElementDto::getProductionDate))
                .collect(Collectors.toList());
    }
}
