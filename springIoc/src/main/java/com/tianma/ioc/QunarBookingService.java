package com.tianma.ioc;

/**
 * Created by Administrator on 2016/3/21.
 */
public class QunarBookingService implements BookingService {

    @Override
    public void bookFlight() {
        System.out.println("book fight by Qunar!");
    }
}
