package com.example.androidutil.imageloader;

class SerialPolicy implements LoaderPolicy {
    @Override
    public int compare(BitmapRequest request1, BitmapRequest request2) {
        return request1.serialNum - request2.serialNum;
    }
}
