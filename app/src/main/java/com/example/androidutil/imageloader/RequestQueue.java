package com.example.androidutil.imageloader;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

class RequestQueue {

    private BlockingQueue<BitmapRequest> requestQueue = new PriorityBlockingQueue<>();

    private static int DEFAULT_CORE_NUMS = Runtime.getRuntime().availableProcessors()+1;

    //NetWorkExecutor,执行网络请求的线程
    private ImageLoader.RequestDispatcher[] dispatchers = null;
    
    int threadCount;
    int mDispatcherNum = 10;
    ArrayDeque<BitmapRequest> list = new ArrayDeque<>();
    
    public RequestQueue(int threadCount) {
        this.threadCount = threadCount;
    }

    private final void startDispatchers(){

        dispatchers = new ImageLoader.RequestDispatcher[mDispatcherNum];
        for(int i=0;i<mDispatcherNum;i++){
            dispatchers[i] = new ImageLoader.RequestDispatcher(requestQueue);
            dispatchers[i].start();
        }
    }

    public void start() {
        stop();
        startDispatchers();
    }

    public void stop() {
    }

    public void addRequest(BitmapRequest request) {
    }

    public BitmapRequest take() {
        return list.poll();
    }
}
