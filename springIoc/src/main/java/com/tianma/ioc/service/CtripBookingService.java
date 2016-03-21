package com.tianma.ioc.service;

import com.tianma.ioc.BookingService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/3/21.
 */
@Component
@Service("CtripBookingService")
public class CtripBookingService  implements BookingService{
    @Override
    public void bookFlight() {
        System.out.println("book fight by Ctrip!");
    }
}
