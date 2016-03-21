package com.tianma.ioc;

/**
 * Created by Administrator on 2016/3/21.
 */
public class CtripBookingService implements BookingService {
    @Override
    public void bookFlight() {
        System.out.println("book fight by Ctrip!");
    }
}
