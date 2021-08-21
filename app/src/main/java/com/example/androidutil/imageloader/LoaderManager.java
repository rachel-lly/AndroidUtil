package com.example.androidutil.imageloader;

import java.util.HashMap;

class LoaderManager {

    public static final String HTTP = "http";
    public static final String HTTPS = "https";
    public static final String FILE = "file";

    private HashMap<String,Loader> mLoaderMap = new HashMap<>();

    private static LoaderManager sInstance;

    private LoaderManager(){
        mLoaderMap.put(HTTP,new UrlLoader());
        mLoaderMap.put(HTTPS,new UrlLoader());
        mLoaderMap.put(FILE,new LocalLoader());
    }

    public Loader getLoader(String schema) {
        if(mLoaderMap.containsKey(schema)){
            return mLoaderMap.get(schema);
        }
        return null;
    }

    public static LoaderManager getInstance(){
        if(sInstance == null){
            synchronized (LoaderManager.class){
                if(sInstance == null){
                    sInstance = new LoaderManager();
                }
            }
        }
        return sInstance;
    }
}
