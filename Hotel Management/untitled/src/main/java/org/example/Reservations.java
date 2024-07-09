package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservations {
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private double price;
    private String status;
    private Guest guest;
    private Room room;
    private DateTimeFormatter formatter=DateTimeFormatter.ofPattern("");

    public Reservations (LocalDate arrivalDate,LocalDate departureDate,double price,String status,Guest guest,Room room){
        this.arrivalDate=arrivalDate;
        this.departureDate=departureDate;
        this.status=status;
        this.price=price;
        this.room=room;
        this.guest=guest;
    }
    public Reservations (){}

    public Guest getGuest() {
        return guest;
    }

    public double getPrice() {
        return price;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public String getStatus() {
        return status;
    }
}
