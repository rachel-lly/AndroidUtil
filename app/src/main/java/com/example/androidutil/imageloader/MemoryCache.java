package com.example.androidutil.imageloader;

import android.graphics.Bitmap;
import android.util.LruCache;

class MemoryCache implements BitmapCache {

    LruCache<String, Bitmap> mImageCache;

    public MemoryCache() {
        initImageCache();
    }

    private void initImageCache() {

        //计算可使用的最大内存
        final int maxMemory = (int)(Runtime.getRuntime().maxMemory()/1024);

        //取四分之一的可用内存作为缓存
        final int cacheSize = maxMemory/4;
        mImageCache = new LruCache<String, Bitmap>(cacheSize){
            @Override
            protected int sizeOf(String key, Bitmap bitmap) {
                return bitmap.getRowBytes() * bitmap.getHeight() / 1024;
            }
        };
    }

    @Override
    public Bitmap get(String url) {
        return mImageCache.get(url);
    }

    @Override
    public void put(String url, Bitmap bitmap) {
        mImageCache.put(url,bitmap);
    }

    @Override
    public Bitmap get(BitmapRequest request) {
        return null;
    }
}
