package com.kunyk.cinemainjector.messaging;

import com.kunyk.cinemainjector.messaging.dto.TicketKafkaDto;
import com.kunyk.cinemainjector.service.TicketService;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class TicketListener {

    private final TicketService ticketService;

    public TicketListener(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @StreamListener(TicketStream.INPUT)
    public void readTicket(@Payload TicketKafkaDto ticketKafkaDto) {
        ticketService.save(ticketKafkaDto);
    }
}
