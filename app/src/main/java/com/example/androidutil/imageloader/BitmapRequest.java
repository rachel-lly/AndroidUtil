package com.example.androidutil.imageloader;

import android.widget.ImageView;

class BitmapRequest implements Comparable<BitmapRequest>{

    public int serialNum;
    public boolean justCacheInMem;
    LoaderPolicy mLoaderPolicy = new SerialPolicy();

    ImageView imageView;
    String uri;
    DisplayConfig displayConfig;
    ImageListener imageListener;

    boolean isCancel = false;

    public BitmapRequest(ImageView imageView, String uri, DisplayConfig displayConfig, ImageListener imageListener) {
        this.imageView = imageView;
        this.uri = uri;
        this.displayConfig = displayConfig;
        this.imageListener = imageListener;
    }

    @Override
    public int compareTo(BitmapRequest o) {
        return mLoaderPolicy.compare(this,o);
    }

    public void setLoadPolicy(LoaderPolicy mLoaderPolicy) {
        this.mLoaderPolicy = mLoaderPolicy;
    }

    public boolean isCancel() {
        return isCancel;
    }


}
