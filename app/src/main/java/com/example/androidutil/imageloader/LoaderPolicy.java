package com.example.androidutil.imageloader;

interface LoaderPolicy {
    public int compare(BitmapRequest request1,BitmapRequest request2);
}
