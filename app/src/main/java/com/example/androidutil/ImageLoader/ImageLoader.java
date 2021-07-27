package com.example.androidutil.ImageLoader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ImageLoader {

    //图片缓存
    ImageCache mImageCache = null;

    //线程池
    ExecutorService mExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public void setmImageCache(ImageCache mImageCache) {
        this.mImageCache = mImageCache;
    }

    //加载图片
    public void displayImage(final String url, final ImageView imageView){
        Bitmap bitmap = mImageCache.get(url);
        if(bitmap != null){
            imageView.setImageBitmap(bitmap);
            return;
        }
        imageView.setTag(url);
        mExecutorService.submit(() -> {

            Bitmap bm = downloadImage(url);
            if(bm == null){
                return;
            }
            if(imageView.getTag().equals(url)){
                imageView.setImageBitmap(bm);
            }
            mImageCache.put(url,bm);
        });
    }

    private Bitmap downloadImage(String imageUrl){

        Bitmap bitmap = null;

        try {
            URL url = new URL(imageUrl);
            final HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            bitmap = BitmapFactory.decodeStream(connection.getInputStream());
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bitmap;
    }

}
