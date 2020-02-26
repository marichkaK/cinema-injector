package com.kunyk.cinemainjector.messaging.dto;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserKafkaDto {

    private Long id;
    private Integer age;
}
