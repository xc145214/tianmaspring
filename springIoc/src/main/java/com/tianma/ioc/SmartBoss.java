package com.tianma.ioc;

import com.tianma.ioc.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/3/21.
 */
@Component
public class SmartBoss {

    private BookingService bookingService;

    @Autowired
    @Qualifier("CtripBookingService")
    public void setBookingService( BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookingService getBookingService() {
        return bookingService;
    }

    public void goSomewhere() {
        bookingService.bookFlight();
    }
}
