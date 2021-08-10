package com.example.androidutil.imageloader;

public class ImageLoaderConfig {

    BitmapCache bitmapCache = new MemoryCache();

    DisplayConfig displayConfig = new DisplayConfig();

    LoaderPolicy loaderPolicy = new SerialPolicy();

    int threadCount = Runtime.getRuntime().availableProcessors() + 1;


    private ImageLoaderConfig(){

    }

    public static class Builder {

        BitmapCache bitmapCache = new MemoryCache();

        DisplayConfig displayConfig = new DisplayConfig();

        LoaderPolicy loaderPolicy = new SerialPolicy();

        int threadCount = Runtime.getRuntime().availableProcessors() + 1;

        public Builder setThreadCount(int threadCount) {
            this.threadCount = Math.max(1,threadCount);
            return this;
        }

        public Builder setBitmapCache(BitmapCache bitmapCache) {
            this.bitmapCache = bitmapCache;
            return this;
        }

        public Builder setLoadingPlaceholder(int resId) {
            this.displayConfig.loadingResId = resId;
            return this;
        }

        public Builder setNotFoundPlaceholder(int resId) {
            this.displayConfig.loadingFailedResId = resId;
            return this;
        }

        public Builder setLoadPolicy(LoaderPolicy loaderPolicy) {
            if(loaderPolicy != null){
                this.loaderPolicy = loaderPolicy;
            }
            return this;
        }

        void applyConfig(ImageLoaderConfig config){
            config.bitmapCache = bitmapCache;
            config.displayConfig = displayConfig;
            config.loaderPolicy = loaderPolicy;
            config.threadCount = threadCount;
        }


        public ImageLoaderConfig create(){
            ImageLoaderConfig config = new ImageLoaderConfig();
            applyConfig(config);
            return config;
        }

    }
}
