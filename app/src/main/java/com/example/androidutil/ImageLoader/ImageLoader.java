package com.example.androidutil.ImageLoader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ImageLoader {


    private static ImageLoader sInstance;


    //图片缓存
    BitmapCache mImageCache = new MemoryCache();

    //网络请求队列
    //private RequestQueue mImageQueue;

    //图片加载配置对象
    private ImageLoaderConfig mConfig;

    //图片加载中显示的图片id
    int mLoadingImageId;

    //图片加载失败显示的图片id
    int mLoadingFailedImageId;


    //线程池
    ExecutorService mExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    private ImageLoader(){

    }

    public void setImageCache(BitmapCache mImageCache) {
        this.mImageCache = mImageCache;
    }

    public static ImageLoader getInstance(){
        if(sInstance == null){
            synchronized (ImageLoader.class){
                if(sInstance == null){
                    sInstance = new ImageLoader();
                }
            }
        }
        return sInstance;
    }

    public void init(ImageLoaderConfig imageLoaderConfig){
        mConfig = imageLoaderConfig;


        //mImageQueue = new RequestQueue(mConfig.threadCount);
        //mImageQueue.start();
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

//    public void stop(){
//        mImageQueue.stop();
//    }

}


