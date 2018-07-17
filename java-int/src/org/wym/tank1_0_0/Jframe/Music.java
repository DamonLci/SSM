package org.wym.tank1_0_0.Jframe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Music {
    public static final String BGM = "music/startMusic.WAV";
    public static final String BGMOne = "music/bullet.wav";
    public static final String bigBgm="music/woman.WAV";

    public static void playSound(String path) {
        // 定义文件输入流
        try {
            FileInputStream fis = new FileInputStream(path);
            // 定义音频流
            AudioStream as = new AudioStream(fis);
            //播放声音
            AudioPlayer.player.start(as);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
/*
    public static void stopSound(String path){
        try {
            FileInputStream fis = new FileInputStream(path);
            // 定义音频流
            AudioStream as = new AudioStream(fis);
            //播放声音
            AudioPlayer.player.stop(as);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
*/

    public static void soundShot(String path) {
        // 定义文件输入流
        try {
            FileInputStream fis = new FileInputStream(path);
            // 定义音频流
            AudioStream as = new AudioStream(fis);
            //播放声音
            AudioPlayer.player.start(as);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void bigBoom(String path) {
        // 定义文件输入流
        try {
            FileInputStream fis = new FileInputStream(path);
            // 定义音频流
            AudioStream as = new AudioStream(fis);
            //播放声音
            AudioPlayer.player.start(as);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

