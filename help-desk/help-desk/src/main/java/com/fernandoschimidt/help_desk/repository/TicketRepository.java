package com.fernandoschimidt.help_desk.repository;

import com.fernandoschimidt.help_desk.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}