package Micro.TicketApi.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

    private Long Id;
    private FlightDto flightDto;
    private String PassengerName;

    public long getId() {
        return Id;
    }
}
