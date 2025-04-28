package com.minuo.authcenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minuo.authcenter.entity.SmsUser;
import com.minuo.authcenter.service.impl.SmsUserServiceImpl;

@RestController
@RequestMapping("/sms")
public class SmsUserController {


    @Autowired
    SmsUserServiceImpl smsUserServiceImpl;


    @PostMapping("/add")
    public Boolean addUser(@RequestBody SmsUser smsUser) {

        return smsUserServiceImpl.save(smsUser);

    }


    @GetMapping("/sendCode")
    public int sendCode(){

        return 1;
    } 


}
