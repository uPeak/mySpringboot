package cn.myfeng.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyError {

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Object error(HttpServletRequest request, NoHandlerFoundException e){
        String method = request.getMethod();
        String path = request.getRequestURI();
        Map<String,Object> data = new HashMap<>();
        data.put("method",method);
        data.put("path",path);
        data.put(":(","页面火星旅游去了");
        return data;
    }
}
