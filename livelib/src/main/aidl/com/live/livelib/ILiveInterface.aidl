// ILiveInterface.aidl
package com.live.livelib;

// Declare any non-default types here with import statements

interface ILiveInterface {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);

    void InitLive(int width, int height, int fps, int bit, int sampleRate, int channel, int sampleBit);
    void StartLive(String url);
    void StopLive();
}
