package Micro.TicketApi.service;

import Micro.TicketApi.model.FlightDto;
import Micro.TicketApi.model.Ticket;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@FeignClient(name = "flight-api")
public interface FlightClient {
    //función
    @GetMapping("/flights")
    List<FlightDto> getAll();
}
