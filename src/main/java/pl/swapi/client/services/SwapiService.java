package pl.swapi.client.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.swapi.client.repositories.SwapiRepository;

/**
 * @author Daniel Krogulec
 */
@Service
public class SwapiService {

    private final SwapiRepository swapiRepository;

    @Autowired
    public SwapiService(SwapiRepository swapiRepository) {
        this.swapiRepository = swapiRepository;
    }

    public ResponseEntity filmsList() {
        return swapiRepository.filmsList();
    }
}
