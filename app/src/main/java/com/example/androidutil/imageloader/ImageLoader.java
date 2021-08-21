package com.example.androidutil.imageloader;

import android.widget.ImageView;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ImageLoader {


    private static ImageLoader sInstance;


    //图片缓存
    private BitmapCache mImageCache = new MemoryCache();

    //网络请求队列
    private RequestQueue mRequestQueue;

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


        mRequestQueue = new RequestQueue(mConfig.threadCount);
        mRequestQueue.start();
    }

    //加载图片
    public void displayImage(final String uri, final ImageView imageView,final DisplayConfig displayConfig,final ImageListener listener) {


        BitmapRequest request = new BitmapRequest(imageView,uri,displayConfig,listener);
        request.displayConfig = request.displayConfig !=null?request.displayConfig:mConfig.displayConfig;
        request.setLoadPolicy(mConfig.loaderPolicy);
        mRequestQueue.addRequest(request);

//        Bitmap bitmap = mImageCache.get(uri);
//        if(bitmap != null){
//            imageView.setImageBitmap(bitmap);
//            return;
//        }
//        imageView.setTag(uri);
//        mExecutorService.submit(() -> {
//
//            Bitmap bm = downloadImage(uri);
//            if(bm == null){
//                return;
//            }
//            if(imageView.getTag().equals(uri)){
//                imageView.setImageBitmap(bm);
//            }
//            mImageCache.put(uri,bm);
//        });
    }



    public void stop(){
        mRequestQueue.stop();
    }

    public BitmapCache getImageCache() {
        return mImageCache;
    }

    class RequestDispatcher extends Thread{
        @Override
        public void run() {
            while (!this.isInterrupted()){
                final BitmapRequest request = mRequestQueue.take();
                if(request.isCancel()){
                    continue;
                }
                final String schema = parseSchema(request.uri);
                Loader imageLoader = LoaderManager.getInstance().getLoader(schema);
                imageLoader.loadImage(request);
            }
        }
    }

    private String parseSchema(String uri) {
        return null;
    }

}


