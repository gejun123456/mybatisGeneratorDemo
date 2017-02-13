package com.bruce.mybatisGeneratorDemo.dao;
import com.bruce.mybatisGeneratorDemo.entity.MyUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by bruce.ge on 2017/2/13.
 */
public class MyUserMapperTest extends BaseTest {
    @Autowired
    private MyUserMapper myUserMapper;

    @Test
    public void test(){
        MyUser record = new MyUser();
        record.setCookie("cookie");
        record.setType(0);
        record.setUser_name("nima");
        record.setPassword("nima");
        record.setAge(0);
        record.setRemaining_amount(new BigDecimal("0"));
        record.setAdd_time(new Date());
        record.setSerial_id(0L);
        record.setGlobal_id(0L);
        myUserMapper.insert(record);

        List<MyUser> nima = myUserMapper.findByUser_name("nima");
        printToJson(nima);
    }

}