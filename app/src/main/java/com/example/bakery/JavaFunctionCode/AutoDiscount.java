package com.example.bakery.JavaFunctionCode;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AutoDiscount {
    public double discount(BakedGoods bakedGoods){
        // get product produce time;
        Date produceTime = bakedGoods.getProduceTime();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        String productTime = sdf.format(produceTime);
        Calendar prodTime = Calendar.getInstance();
        prodTime.setTime(produceTime);
        // get current time;
        Calendar curTime = Calendar.getInstance();
        Date today = curTime.getTime();
        prodTime.add(Calendar.DAY_OF_MONTH, 1);
        if(today.compareTo(prodTime.getTime()) < 0){
            return 1.0;
        }
        prodTime.add(Calendar.DAY_OF_MONTH, 1);
        if(today.compareTo(prodTime.getTime()) < 0){
            return 0.85;
        }
        prodTime.add(Calendar.DAY_OF_MONTH, 1);
        if(today.compareTo(prodTime.getTime()) < 0){
            return 0.50;
        }
        return 0.0;
        }
    }
