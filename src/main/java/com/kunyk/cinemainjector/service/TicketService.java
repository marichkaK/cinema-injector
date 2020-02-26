package com.kunyk.cinemainjector.service;

import com.kunyk.cinemainjector.messaging.dto.TicketKafkaDto;
import com.kunyk.cinemainjector.model.MovieSessionPlaceData;
import com.kunyk.cinemainjector.model.Ticket;
import com.kunyk.cinemainjector.model.User;
import com.kunyk.cinemainjector.repository.TicketRepository;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public void save(TicketKafkaDto ticketDto) {
        Ticket ticket;
        if(ticketDto.getUser()!=null) {
             ticket = Ticket.builder()
                    .ticketId(ticketDto.getTicketId())
                    .user(User.toUser(ticketDto.getUser()))
                    .movieSessionPlaceData(MovieSessionPlaceData.toMovieData(ticketDto.getMovieSessionPlaceDataKafkaDto()))
                    .build();
        } else {
            ticket = Ticket.builder()
                    .ticketId(ticketDto.getTicketId())
                    .movieSessionPlaceData(MovieSessionPlaceData.toMovieData(ticketDto.getMovieSessionPlaceDataKafkaDto()))
                    .build();
        }

        ticketRepository.save(ticket);
    }
}
