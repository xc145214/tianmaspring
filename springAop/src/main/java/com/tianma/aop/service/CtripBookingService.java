package com.tianma.aop.service;

import com.tianma.aop.BookingService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/3/21.
 */
@Component
@Service("CtripBookingService")
public class CtripBookingService implements BookingService {
    @Override
    public boolean bookFlight() {
        System.out.println("book fight by Ctrip!");
        return Boolean.FALSE;
    }
}
