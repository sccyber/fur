package com.scscyber.fur.common.ultility;

import com.scscyber.fur.common.model.ConstantValue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class CalculatorHelper {
    public static String GeneratePassword(){
        return UUID.randomUUID().toString().replace("-", "");
    }
    public static String FormatDate(Date date){
        DateFormat dateFormat = new SimpleDateFormat(ConstantValue.DateWithHour);
        return dateFormat.format(date);
    }
}
