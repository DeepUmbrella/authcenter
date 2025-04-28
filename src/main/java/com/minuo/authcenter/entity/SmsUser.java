package com.minuo.authcenter.entity;

import java.sql.Timestamp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("sms_user_info")
public class SmsUser {
    @TableId(type = IdType.AUTO)
    private Long uid;

    @TableField("game_uid")
    private Long game_uid;

    private String phone_number;

    private String email; 

    private Boolean status;

    @TableField("create_at")

    private Timestamp    create_at;

    private Timestamp   update_at;

}
