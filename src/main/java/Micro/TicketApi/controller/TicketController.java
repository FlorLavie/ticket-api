package Micro.TicketApi.controller;

import Micro.TicketApi.model.Ticket;
import Micro.TicketApi.service.TicketService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/all")
    public List<Ticket> getTickets(){
        return ticketService.getAll();

    }

    @PostMapping("/")
        public Ticket addTicket(@RequestBody Ticket ticket) {
            return ticketService.add(ticket);
        }

}
