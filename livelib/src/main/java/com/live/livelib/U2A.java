package com.live.livelib;

import android.util.Log;

public class U2A {

    public static void InitLive(int width, int height, int fps, int bit, int sampleRate, int channel, int sampleBit) {
        Log.i(Util.LOG_TAG, "U2A:InitLive");
//        Scheduler.Instance().live.InitLive(width, height, fps, bit, sampleRate, channel, sampleBit);

        LiveClient.Instance().InitLive(width, height, fps, bit, sampleRate, channel, sampleBit);
    }

    public static void StartLive(String url) {
        Log.i(Util.LOG_TAG, "U2A:StartLive:" +url);
//        Scheduler.Instance().live.StartLive(url);
        LiveClient.Instance().StartLive(url);
    }

    public static void StopLive() {
        Log.i(Util.LOG_TAG, "U2A:StopLive");
//        Scheduler.Instance().live.StopLive();
        LiveClient.Instance().StopLive();
    }

    public static void WriteAudioStream(byte[] data, int len){
        Log.i(Util.LOG_TAG, "U2A:WriteAudioStream");
        Scheduler.Instance().live.WriteAudioStream(data, len);
    }
}
