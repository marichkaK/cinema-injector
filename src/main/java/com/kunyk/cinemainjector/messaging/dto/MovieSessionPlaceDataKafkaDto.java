package com.kunyk.cinemainjector.messaging.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MovieSessionPlaceDataKafkaDto {
    private Long movieSessionPlaceDataId;
    private Integer price;
    private SessionKafkaDto sessionKafkaDto;
}
