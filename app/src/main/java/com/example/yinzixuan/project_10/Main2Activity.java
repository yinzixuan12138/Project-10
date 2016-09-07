package com.example.yinzixuan.project_10;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView Name_Text=(TextView)findViewById(R.id.textView4) ;
        TextView Number_Text=(TextView)findViewById(R.id.textView3);

        Intent intent=getIntent();
        Integer number=intent.getIntExtra("Number",0);
        String name=intent.getStringExtra("Name");
        Name_Text.setText("姓名："+name);
        Number_Text.setText("学号："+number);
        Toast.makeText(Main2Activity.this,"输入成功",Toast.LENGTH_SHORT);
        Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent2);
                finish();
            }
        });
    }

}
