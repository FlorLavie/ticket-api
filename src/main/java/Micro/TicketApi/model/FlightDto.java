package Micro.TicketApi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightDto {
    private Long id;
    private String Origin;
    private String destiny;
    private String departureTime;
    private String arrivingTime;
    private double precio;
    private String frecuency;
}
