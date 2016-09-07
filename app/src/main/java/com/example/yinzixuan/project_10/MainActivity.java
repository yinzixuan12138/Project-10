package com.example.yinzixuan.project_10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button)findViewById(R.id.button);
        final EditText Number=(EditText)findViewById(R.id.editText2);
        final EditText Name=(EditText)findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                int number;
                int n1=1;
                int n2=1;
                try{

                String number_string=Number.getText().toString();
                number=Integer.parseInt(number_string);
                intent.putExtra("Number",number);
                    n1=0;
                    }
                catch (Exception e){
                    Toast.makeText(MainActivity.this,"学号输入有误",Toast.LENGTH_SHORT).show();
                }
                try{

                    String name_string=Name.getText().toString();
                    intent.putExtra("Name",name_string);
                    n2=0;
}
                catch (Exception e){
                    Toast.makeText(MainActivity.this,"姓名输入有误",Toast.LENGTH_SHORT).show();
                }
                if(n1==0&&n2==0)
                startActivity(intent);
                finish();
            }
        });
    }
public void a(View v){
    Toast.makeText(MainActivity.this,"请输入学号",Toast.LENGTH_SHORT).show();
}
    public void b(View v){
        Toast.makeText(MainActivity.this,"请输入姓名",Toast.LENGTH_SHORT).show();
    }
}

