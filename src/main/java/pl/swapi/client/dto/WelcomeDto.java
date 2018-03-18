package pl.swapi.client.dto;

import com.google.common.collect.Lists;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Daniel Krogulec
 */
@Getter
@Setter
public class WelcomeDto {
    private String helloMessage;
    private String description;
    private List<String> endpoints;

    @Builder
    public WelcomeDto(String helloMessage, String description, List<String> endpoints) {
        this.helloMessage = helloMessage;
        this.description = description;
        this.endpoints = endpoints;
    }

    public static WelcomeDto produceWelcomeDto() {
        return WelcomeDto
                .builder()
                .helloMessage("Welcome in SWAPIClient!")
                .description("Simple REST client for https://swapi.co/")
                .endpoints(Lists.newArrayList("/films/list"))
                .build();
    }
}
