package com.fernandoschimidt.help_desk.controller;


import com.fernandoschimidt.help_desk.entity.Ticket;
import com.fernandoschimidt.help_desk.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.save(ticket);
    }

    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketService.findAll();
    }

    @GetMapping("/{id}")
    public Ticket getTicketById(@PathVariable Long id) {
        return ticketService.findById(id).orElse(null);
    }
}