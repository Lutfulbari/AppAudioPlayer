package com.lutful.appaudioplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgPlay1, imgPlay2,imgPlay3,imgPlay4;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgPlay1 = findViewById(R.id.imgPlay1);
        imgPlay2 = findViewById(R.id.imgPlay2);
        imgPlay3 = findViewById(R.id.imgPlay3);
        imgPlay4 = findViewById(R.id.imgPlay4);

        imgPlay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (imgPlay1.getTag()!=null && imgPlay1.getTag().toString().contains("NOT_PLAYING")){

                    if (mediaPlayer!=null) mediaPlayer.release();
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.kahf);
                    mediaPlayer.start();
                    imgPlay1.setImageResource(R.drawable.stop);
                    imgPlay1.setTag("PLAYING_NOW");
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {

                            imgPlay1.setImageResource(R.drawable.play);
                            imgPlay1.setTag("NOT_PLAYING");

                        }
                    });

                 }else{
                    if (mediaPlayer!=null) mediaPlayer.release();
                    imgPlay1.setImageResource(R.drawable.play);
                    imgPlay1.setTag("NOT_PLAYING");
                }



            }
        });




        imgPlay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (imgPlay2.getTag()!=null && imgPlay2.getTag().toString().contains("NOT_PLAYING")){

                    if (mediaPlayer!=null) mediaPlayer.release();
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.tin);
                    mediaPlayer.start();
                    imgPlay2.setImageResource(R.drawable.stop);
                    imgPlay2.setTag("PLAYING_NOW");
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {

                            imgPlay2.setImageResource(R.drawable.play);
                            imgPlay2.setTag("NOT_PLAYING");

                        }
                    });

                }else{
                    if (mediaPlayer!=null) mediaPlayer.release();
                    imgPlay2.setImageResource(R.drawable.play);
                    imgPlay2.setTag("NOT_PLAYING");
                }



            }
        });
        ///////////////////////////

        imgPlay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (imgPlay3.getTag()!=null && imgPlay3.getTag().toString().contains("NOT_PLAYING")){

                    if (mediaPlayer!=null) mediaPlayer.release();
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mulk);
                    mediaPlayer.start();
                    imgPlay3.setImageResource(R.drawable.stop);
                    imgPlay3.setTag("PLAYING_NOW");
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {

                            imgPlay3.setImageResource(R.drawable.play);
                            imgPlay3.setTag("NOT_PLAYING");

                        }
                    });

                }else{
                    if (mediaPlayer!=null) mediaPlayer.release();
                    imgPlay3.setImageResource(R.drawable.play);
                    imgPlay3.setTag("NOT_PLAYING");
                }



            }
        });

        /////////////

        imgPlay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (imgPlay4.getTag()!=null && imgPlay4.getTag().toString().contains("NOT_PLAYING")){

                    if (mediaPlayer!=null) mediaPlayer.release();
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wa);
                    mediaPlayer.start();
                    imgPlay4.setImageResource(R.drawable.stop);
                    imgPlay4.setTag("PLAYING_NOW");
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {

                            imgPlay4.setImageResource(R.drawable.play);
                            imgPlay4.setTag("NOT_PLAYING");

                        }
                    });

                }else{
                    if (mediaPlayer!=null) mediaPlayer.release();
                    imgPlay4.setImageResource(R.drawable.play);
                    imgPlay4.setTag("NOT_PLAYING");
                }



            }
        });


    }
}