package pl.swapi.client.dto.people;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Daniel Krogulec
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PeopleListElementDto {
    private String name;
    private String gender;
    private String url;
}
