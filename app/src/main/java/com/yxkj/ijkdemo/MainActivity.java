package com.yxkj.ijkdemo;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dou361.ijkplayer.widget.IjkVideoView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IjkVideoView video_view = (IjkVideoView) findViewById(R.id.video_view);
        video_view.setVideoURI(Uri.parse("http://9890.vod.myqcloud.com/9890_4e292f9a3dd011e6b4078980237cc3d3.f30.mp4"));
        video_view.start();
    }
}
