package com.example.eventsCalendert.repository;


import com.example.eventsCalendert.entity.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EventsRepository extends JpaRepository <Events, Integer > {
//    @Query(value = )
}
