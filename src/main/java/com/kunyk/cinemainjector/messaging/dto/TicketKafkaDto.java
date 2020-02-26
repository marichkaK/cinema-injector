package com.kunyk.cinemainjector.messaging.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TicketKafkaDto {
    private Long ticketId;
    private UserKafkaDto user;
    private MovieSessionPlaceDataKafkaDto movieSessionPlaceDataKafkaDto;
}

