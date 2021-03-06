package com.bruce.mybatisGeneratorDemo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MyUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_user.id
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_user.cookie
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    private String cookie;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_user.type
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_user.user_name
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    private String user_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_user.password
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_user.age
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_user.remaining_amount
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    private BigDecimal remaining_amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_user.add_time
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    private Date add_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_user.serial_id
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    private Long serial_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_user.global_id
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    private Long global_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_user.id
     *
     * @return the value of my_user.id
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_user.id
     *
     * @param id the value for my_user.id
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_user.cookie
     *
     * @return the value of my_user.cookie
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    public String getCookie() {
        return cookie;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_user.cookie
     *
     * @param cookie the value for my_user.cookie
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    public void setCookie(String cookie) {
        this.cookie = cookie == null ? null : cookie.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_user.type
     *
     * @return the value of my_user.type
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_user.type
     *
     * @param type the value for my_user.type
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_user.user_name
     *
     * @return the value of my_user.user_name
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_user.user_name
     *
     * @param user_name the value for my_user.user_name
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_user.password
     *
     * @return the value of my_user.password
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_user.password
     *
     * @param password the value for my_user.password
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_user.age
     *
     * @return the value of my_user.age
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_user.age
     *
     * @param age the value for my_user.age
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_user.remaining_amount
     *
     * @return the value of my_user.remaining_amount
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    public BigDecimal getRemaining_amount() {
        return remaining_amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_user.remaining_amount
     *
     * @param remaining_amount the value for my_user.remaining_amount
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    public void setRemaining_amount(BigDecimal remaining_amount) {
        this.remaining_amount = remaining_amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_user.add_time
     *
     * @return the value of my_user.add_time
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    public Date getAdd_time() {
        return add_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_user.add_time
     *
     * @param add_time the value for my_user.add_time
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_user.serial_id
     *
     * @return the value of my_user.serial_id
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    public Long getSerial_id() {
        return serial_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_user.serial_id
     *
     * @param serial_id the value for my_user.serial_id
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    public void setSerial_id(Long serial_id) {
        this.serial_id = serial_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_user.global_id
     *
     * @return the value of my_user.global_id
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    public Long getGlobal_id() {
        return global_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_user.global_id
     *
     * @param global_id the value for my_user.global_id
     *
     * @mbg.generated Mon Feb 13 17:08:12 CST 2017
     */
    public void setGlobal_id(Long global_id) {
        this.global_id = global_id;
    }
}