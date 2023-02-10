package com.jocelyncooper.backend.repository;

import com.jocelyncooper.backend.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    Optional<Ticket> findTicketById(Long id);
}
