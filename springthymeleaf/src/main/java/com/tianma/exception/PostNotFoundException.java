package com.tianma.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Administrator on 2016/3/22.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "no such Post")
public class PostNotFoundException  extends RuntimeException{

}
