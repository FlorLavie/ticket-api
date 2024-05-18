package Micro.TicketApi.controller;

import Micro.TicketApi.model.FlightDto;
import Micro.TicketApi.model.Ticket;
import Micro.TicketApi.service.FlightClient;
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
    @Autowired
    private FlightClient flightClient;


    @GetMapping("/flights")
    public List<FlightDto> getAll(){
    return flightClient.getAll();
    }

    // obtener tickets
    @GetMapping("/all")
    public List<Ticket> getTickets(){
        return ticketService.getAll();

    }
    // crear ticket
    @PostMapping("/add")
        public Ticket addTicket(@RequestBody Ticket ticket) {
            return ticketService.add(ticket);
        }

    @GetMapping("/findID")
    public Ticket findID(){
        long id = 2;
        Ticket ticketEncontrado = ticketService.findTicketID(id);
        return ticketEncontrado;
    }

    // Borrar vuelo
    @DeleteMapping("/delete")
    public void deleteFlight(){
        long id = 1L;
        ticketService.deleteticket(id);
    }


}
