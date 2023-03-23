package com.example.eventsCalendert.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Events {
    @Id
    int id;
    String name;
    String date;
    String location;
    String comment;
}
