package com.nxc122430.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // create variable to the buttons
    TextView apple;
    TextView banana;
    TextView grape;
    TextView lettuce;
    TextView watermelon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get textview by id
        apple = (TextView) findViewById(R.id.textView1);
        banana = (TextView) findViewById(R.id.textView2);
        grape = (TextView) findViewById(R.id.textView3);
        lettuce = (TextView) findViewById(R.id.textView4);
        watermelon = (TextView) findViewById(R.id.textView5);

        // set textview to handler
        apple.setOnClickListener(handler);
        banana.setOnClickListener(handlerOne);
        grape.setOnClickListener(handlerTwo);
        lettuce.setOnClickListener(handlerThree);
        watermelon.setOnClickListener(handlerFour);
    }

    // create handlers to click on
    View.OnClickListener handler = new View.OnClickListener() {
        public void onClick(View v) {
            // after click set text to invisible
            apple.setVisibility(View.INVISIBLE);
        }
    };

    View.OnClickListener handlerOne = new View.OnClickListener() {
        public void onClick(View v) {
            // after click set text to invisible
            banana.setVisibility(View.INVISIBLE);
        }
    };

    View.OnClickListener handlerTwo = new View.OnClickListener() {
        public void onClick(View v) {
            // after click set text to invisible
            grape.setVisibility(View.INVISIBLE);
        }
    };

    View.OnClickListener handlerThree = new View.OnClickListener() {
        public void onClick(View v) {
            // after click set text to invisible
            lettuce.setVisibility(View.INVISIBLE);
        }
    };

    View.OnClickListener handlerFour = new View.OnClickListener() {
        public void onClick(View v) {
            // after click set text to invisible
            watermelon.setVisibility(View.INVISIBLE);
        }
    };

}
