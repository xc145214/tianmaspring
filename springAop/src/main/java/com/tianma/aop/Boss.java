package com.tianma.aop;

import com.tianma.aop.service.QunarBookingService;

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
        long start = System.currentTimeMillis();

        //订机票
        boolean status = bookingService.bookFlight();
        //查看耗时
        long duration = System.currentTimeMillis()- start;
        System.out.println(String.format("time for booking flight is %d seconds", duration));

        //记录日志
        if (status) {
            System.out.println("booking flight succeeded!");
        } else {
            System.out.println("booking flight failed!");
        }
    }
}
