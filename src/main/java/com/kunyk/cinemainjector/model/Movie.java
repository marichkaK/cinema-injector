package com.kunyk.cinemainjector.model;

import com.kunyk.cinemainjector.messaging.dto.MovieKafkaDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Movie {
    private Long movieId;
    private String name;
    private Integer duration;
    private Integer minAge;
    private String country;
    private List<String> genres;

    public static Movie toModel(MovieKafkaDto movieKafkaDto){
        return Movie.builder()
                .name(movieKafkaDto.getName())
                .duration(movieKafkaDto.getDuration())
                .minAge(movieKafkaDto.getMinAge())
                .country(movieKafkaDto.getCountry())
                .genres(movieKafkaDto.getGenres())
                .build();
    }
}