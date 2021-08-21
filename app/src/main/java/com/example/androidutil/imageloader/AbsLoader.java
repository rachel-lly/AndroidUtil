package com.example.androidutil.imageloader;

import android.graphics.Bitmap;

abstract class AbsLoader implements Loader {

    private static BitmapCache mCache = ImageLoader.getInstance().getImageCache();

    @Override
    public void loadImage(BitmapRequest request) {
        Bitmap resultBitmap = mCache.get(request);
        if(resultBitmap == null){
            showLoading(request);
            resultBitmap = onLoadImage(request);
            cacheBitmap(request,resultBitmap);
        }else{
            request.justCacheInMem = true;
        }
        deliveryToUIThread(request,resultBitmap);
    }



    void deliveryToUIThread(BitmapRequest request, Bitmap resultBitmap){

    }

    void cacheBitmap(BitmapRequest request, Bitmap resultBitmap){

    }

    abstract Bitmap onLoadImage(BitmapRequest request);

    void showLoading(BitmapRequest request){

    }
}
