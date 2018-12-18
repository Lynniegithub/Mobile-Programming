package com.kmu.freetogo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView dfs;
    private Object v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageButton lotte = (ImageButton) findViewById(R.id.lottedutyfree);
        lotte.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                String url = "http://kor.lottedfs.com/kr";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        ImageButton shilla = (ImageButton) findViewById(R.id.shilladutyfree);
        shilla.setOnClickListener(new View.OnClickListener()

        {
            public void onClick (View v){
                String url = "http://m.shilladfs.com/estore/kr/ko/?uiel=Mobile";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        ImageButton shinsegae = (ImageButton) findViewById(R.id.shinsegaedutyfree);
        shinsegae.setOnClickListener(new View.OnClickListener()

        {
            public void onClick (View v){
                String url = "http://www.ssgdfm.com/shop/main";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        ImageButton doota = (ImageButton) findViewById(R.id.dootadutyfree);
        doota.setOnClickListener(new View.OnClickListener()

        {
            public void onClick (View v){
                String url = "http://www.dootadutyfree.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        ImageButton dongwha = (ImageButton) findViewById(R.id.dongwhadutyfree);
        dongwha.setOnClickListener(new View.OnClickListener()

        {
            public void onClick (View v){
                String url = "https://m.dwdfs.com/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        ImageButton galleria = (ImageButton) findViewById(R.id.galleriadutyfree);
        galleria.setOnClickListener(new View.OnClickListener()

        {
            public void onClick (View v){
                String url = "www.galleria-dfs.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        ImageButton sm = (ImageButton) findViewById(R.id.smdutyfree);
        sm.setOnClickListener(new View.OnClickListener()

        {
            public void onClick (View v){
                String url = "http://m.smdutyfree.com/fcm001.do?goTo=main";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        ImageButton jdc = (ImageButton) findViewById(R.id.jdcdutyfree);
        jdc.setOnClickListener(new View.OnClickListener()

        {
            public void onClick (View v){
                String url = "https://m.jdcdutyfree.com/index.htm";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        TextView dfs = (TextView) findViewById(R.id.dfs);
        dfs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), search.class);
                startActivity(intent);

            }
        });
    }


}