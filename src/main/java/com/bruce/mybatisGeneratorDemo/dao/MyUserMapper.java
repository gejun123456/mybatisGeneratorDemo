package com.bruce.mybatisGeneratorDemo.dao;

import com.bruce.mybatisGeneratorDemo.entity.MyUser;
import com.bruce.mybatisGeneratorDemo.entity.MyUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface MyUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_user
     *
     * @mbg.generated Mon Feb 13 16:59:54 CST 2017
     */
    long countByExample(MyUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_user
     *
     * @mbg.generated Mon Feb 13 16:59:54 CST 2017
     */
    int deleteByExample(MyUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_user
     *
     * @mbg.generated Mon Feb 13 16:59:54 CST 2017
     */
    int insert(MyUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_user
     *
     * @mbg.generated Mon Feb 13 16:59:54 CST 2017
     */
    int insertSelective(MyUser record);


    List<MyUser> findByAdd_time(@Param("add_time")Date add_time);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_user
     *
     * @mbg.generated Mon Feb 13 16:59:54 CST 2017
     */
    List<MyUser> selectByExample(MyUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_user
     *
     * @mbg.generated Mon Feb 13 16:59:54 CST 2017
     */
    int updateByExampleSelective(@Param("record") MyUser record, @Param("example") MyUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_user
     *
     * @mbg.generated Mon Feb 13 16:59:54 CST 2017
     */
    int updateByExample(@Param("record") MyUser record, @Param("example") MyUserExample example);
}