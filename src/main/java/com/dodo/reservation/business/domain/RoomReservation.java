package com.dodo.reservation.business.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter @Getter
public class RoomReservation {
    private long roomId;
    private long guestId;
    private String roomName;
    private String roomNumber;
    private String firstName;
    private String lastName;
    private Date date;
}
