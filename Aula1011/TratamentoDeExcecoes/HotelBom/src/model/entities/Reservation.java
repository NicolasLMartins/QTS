package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    // public void updateDates (Date checkIn, Date checkOut) {
    //     this.checkIn = checkIn;
    //     this.checkOut = checkOut;
    // }
    
    public String updateDates (Date checkIn, Date checkOut) {
        Date now = new Date();

        if (checkIn.before(now) || checkOut.before(now)) {
            return "Reservation dates must be future dates";
        }

        if (!checkOut.after(checkIn)) {
            return "Check-out date must be after check-in date.";
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;

        return null;
    }

    @Override
    public String toString() {
        return String.format("Room: %d, Check-in: %s, Check-out: %s, %d nights.", roomNumber, sdf.format(checkIn), sdf.format(checkOut), duration());
    }
}
