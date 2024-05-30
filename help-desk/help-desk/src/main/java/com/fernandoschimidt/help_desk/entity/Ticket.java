package com.fernandoschimidt.help_desk.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String status; // OPEN, IN_PROGRESS, CLOSED

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}