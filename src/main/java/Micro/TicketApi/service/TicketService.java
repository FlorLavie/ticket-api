package Micro.TicketApi.service;

import Micro.TicketApi.model.Ticket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {

    private List<Ticket> tickets = new ArrayList<>();

    public List<Ticket> getAll() {
        return tickets;
    }

    public Ticket add(Ticket ticket){
        tickets.add(ticket);
        return ticket;
    }
}
