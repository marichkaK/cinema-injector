package com.kunyk.cinemainjector.model;

import com.kunyk.cinemainjector.messaging.dto.UserKafkaDto;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@Document
public class User {

    @Id
    private String id;

    @Field
    private Long userId;

    @Field
    private Integer age;

    public static User toUser(UserKafkaDto userKafkaDto) {
        return new User(null, userKafkaDto.getId(), userKafkaDto.getAge());
    }
}
