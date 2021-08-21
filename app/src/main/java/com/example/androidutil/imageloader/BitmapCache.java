package com.example.androidutil.imageloader;

import android.graphics.Bitmap;

public interface BitmapCache {

    Bitmap get(String url);

    void put(String url, Bitmap bitmap);

    Bitmap get(BitmapRequest request);
}
