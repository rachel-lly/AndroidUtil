package com.example.androidutil.ImageLoader;

import android.graphics.Bitmap;

class DoubleCache implements ImageCache{

    MemoryCache mMemoryCache = new MemoryCache();
    DiskCache mDiskCache = new DiskCache();

    @Override
    public Bitmap get(String url) {
        Bitmap bitmap = mMemoryCache.get(url);

        if(bitmap == null) return mDiskCache.get(url);
        return bitmap;
    }

    @Override
    public void put(String url, Bitmap bitmap) {
        mMemoryCache.put(url, bitmap);
        mDiskCache.put(url, bitmap);
    }
}
