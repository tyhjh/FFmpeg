package com.yorhp.ffmpegdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import ffmpeg.FFmpeg;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.tv_test);
        textView.setText(FFmpeg.getsInstance().avcodecinfo());
        //视频转GIF
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                String pathFrom = "/mnt/sdcard/av.mp4";
                String pathTo = "/mnt/sdcard/av.gif";
                Setting setting = new Setting(true,
                        1080,
                        1920,
                        20,
                        0,
                        20);
                Mv2Gif.convert(pathFrom, pathTo, setting);
            }
        }).start();*/
    }
}
