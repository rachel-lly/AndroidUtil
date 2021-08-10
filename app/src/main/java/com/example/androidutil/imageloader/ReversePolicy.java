package com.example.androidutil.imageloader;

class ReversePolicy implements LoaderPolicy {
    @Override
    public int compare(BitmapRequest request1, BitmapRequest request2) {
        return request2.serialNum - request1.serialNum;
    }
}
