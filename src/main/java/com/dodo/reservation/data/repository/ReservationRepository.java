package com.dodo.reservation.data.repository;

import com.dodo.reservation.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    List<Reservation> findByDate(Date date);
}
