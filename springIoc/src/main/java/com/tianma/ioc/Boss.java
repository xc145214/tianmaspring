package com.tianma.ioc;

import com.tianma.ioc.service.QunarBookingService;

/**
 * Created by Administrator on 2016/3/21.
 */
public class Boss {
    private BookingService bookingService;

    public Boss() {
        this.bookingService = new QunarBookingService();
    }

    public BookingService getBookingService() {
        return bookingService;
    }

    public void setBookingService(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public void goSomewhere() {
        bookingService.bookFlight();
    }
}
