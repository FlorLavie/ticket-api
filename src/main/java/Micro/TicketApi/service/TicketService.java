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

    public void deleteticket(long id) {
        Ticket ticketABorrar = findTicketID(id);
        tickets.remove(ticketABorrar);
    }



    public Ticket findTicketID(long id) {
        for (int i=0; i < tickets.size(); i++){
            if (tickets.get(i).getId()==id){
                return  tickets.get(i);

            }
        }
        return null;



    }
}
