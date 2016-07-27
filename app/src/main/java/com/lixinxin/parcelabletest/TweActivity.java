package com.lixinxin.parcelabletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.lixinxin.parcelabletest.bean.Student;

public class TweActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twe);

        tv = (TextView) findViewById(R.id.tv);

        Student s = getIntent().getParcelableExtra("key");
        tv.setText(s.getName() + s.getAge() + s.isSex());

    }
}
