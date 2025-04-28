package com.minuo.authcenter.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.minuo.authcenter.entity.SmsUser;
import com.minuo.authcenter.mapper.SmsUserMapper;
import com.minuo.authcenter.service.SmsUserService;

@Service
public class SmsUserServiceImpl extends ServiceImpl<SmsUserMapper,SmsUser> implements SmsUserService{

    @Autowired
    SmsUserMapper  smsUserMapper;

    @Override
    public SmsUser getOne(String id) {
       return  smsUserMapper.selectById(id);
    }

    @Override
    public List<SmsUser> getIdOverOneday(Date date) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIdOverOneday'");
    }


}
