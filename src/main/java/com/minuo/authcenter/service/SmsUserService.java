package com.minuo.authcenter.service;

import java.sql.Date;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.minuo.authcenter.entity.SmsUser;

public interface SmsUserService extends IService<SmsUser>    {

    public SmsUser getOne(String id);


    public List<SmsUser> getIdOverOneday(Date date);
}
