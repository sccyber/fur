package com.scscyber.fur.model.dto;

import com.scscyber.fur.common.ultility.CalculatorHelper;
import lombok.Data;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Data
public class UserCreateDto {
    private String email;
    private String password;
    private String date;

    public UserCreateDto(String email, String password) {
        this.email = email;
        this.password = password;
        this.date = CalculatorHelper.FormatDate(new Date());
    }
}
