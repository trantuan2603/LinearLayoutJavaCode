package com.landsoft.linearlayoutjavacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LinearLayoutRaw extends AppCompatActivity {
    private LinearLayout linearLayoutRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_linear_layout);
        initLayoutLinear();
        setContentView(linearLayoutRoot);
    }

    public void initLayoutLinear() {
//        raw linearlayout root
        linearLayoutRoot = new LinearLayout(this);
        linearLayoutRoot.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        linearLayoutRoot.setOrientation(LinearLayout.VERTICAL);

//      raw linear lyout sub one
        LinearLayout linearLayoutSubOne = new LinearLayout(this);
        linearLayoutSubOne.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        linearLayoutRoot.setOrientation(LinearLayout.HORIZONTAL);

//        raw imageView
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.mipmap.ic_launcher_round);
//        imageView.layout(50,50,50,50);

//        raw textView
        TextView textView = new TextView(this);
        textView.setText("Thang khung ban cua");

        LinearLayout.LayoutParams lay = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        lay.gravity = Gravity.CENTER;
        textView.setLayoutParams(lay);

        linearLayoutSubOne.addView(imageView);
        linearLayoutSubOne.addView(textView);

        Button button = new Button(this);
        button.setLayoutParams(lay);
        button.setText("Click ngu");


        Button button2 = new Button(this);
        button2.setLayoutParams(lay);
        button2.setText("Click ngu ");


        linearLayoutRoot.addView(linearLayoutSubOne);
        linearLayoutRoot.addView(button);
        linearLayoutRoot.addView(button2);
    }
}
