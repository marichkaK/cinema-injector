package com.kunyk.cinemainjector.messaging.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SessionKafkaDto {
    private Long id;
    private MovieKafkaDto movieKafkaDto;
}
