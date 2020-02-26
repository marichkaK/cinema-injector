package com.kunyk.cinemainjector.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface TicketStream {
    String INPUT = "cinema-client-ticket-in";

    @Input(INPUT)
    SubscribableChannel readTickets();
}
