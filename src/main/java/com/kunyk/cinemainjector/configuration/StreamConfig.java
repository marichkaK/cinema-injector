package com.kunyk.cinemainjector.configuration;

import com.kunyk.cinemainjector.messaging.TicketStream;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(TicketStream.class)
public class StreamConfig {

}
