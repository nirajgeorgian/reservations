package com.dodo.reservation.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity

@Table(name="RESERVATION")
@Data
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RESERVATION_ID")
    private long id;

    @Column(name = "ROOM_ID")
    private long roomId;

    @Column(name = "GUEST_ID")
    private long guestId;

    @Column(name = "RES_DATE")
    private Date date;
}
