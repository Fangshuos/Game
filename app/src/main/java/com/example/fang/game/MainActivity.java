package com.example.fang.game;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //新建一个textview
        TextView tv=new TextView(this);
        //新建以一个Imageview
        ImageView im=new ImageView(this);
        Button but=new Button(this);
    }
}
