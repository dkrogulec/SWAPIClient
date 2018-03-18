package pl.swapi.client.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author Daniel Krogulec
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class FilmListElementDto {
    private String url;
    private String title;
    private String director;

    @JsonProperty("release_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date productionDate;
}
