package com.xq.myandroidannotations;

import androidx.appcompat.app.AppCompatActivity;


import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

//这是最为基本的一个注解，表示该类是一个Activity，并且对应于哪个布局文件
@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    //为该按钮(R.id.btn)注册监听事件，表明该方法为该按钮的点击事件方法
    @Click
    void btn() {
        SecondActivity.startSecondActivity(this, "我是来自第一个页面的msg");
    }
}
