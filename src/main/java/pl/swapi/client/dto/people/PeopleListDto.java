package pl.swapi.client.dto.people;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Daniel Krogulec
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PeopleListDto {

    @JsonProperty("results")
    private List<PeopleListElementDto> people;
}
