package com.xq.myandroidannotations;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_second)
public class SecondActivity extends AppCompatActivity {

    //相当于findViewById(R.id.xxx)。 声明为public不能为private
    @ViewById(R.id.tv2)
    TextView tvText;

    //获得其它地方跳转过来时所传递过来的数据，括号中的字符串即为传递过来的数据的key
    @Extra("msg")
    String msg;

    //只有所有View都注入完毕之后，才会执行该注解的方法，一般进行一些初始化的操作
    @AfterViews
    void onLoad() {
        tvText.setText(msg);
    }

    public static void startSecondActivity(Context context, String msg) {
        //注意 ： SecondActivity_ 带后缀下划线
        Intent intent = new Intent(context, SecondActivity_.class);
        intent.putExtra("msg", msg);
        context.startActivity(intent);
    }
}
