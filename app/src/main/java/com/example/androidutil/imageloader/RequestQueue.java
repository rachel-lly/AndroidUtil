package com.example.androidutil.imageloader;

import java.util.ArrayDeque;

class RequestQueue {
    
    int threadCount;
    ArrayDeque<BitmapRequest> list = new ArrayDeque<>();
    
    public RequestQueue(int threadCount) {
        this.threadCount = threadCount;
    }

    public void start() {
    }

    public void stop() {
    }

    public void addRequest(BitmapRequest request) {
    }

    public BitmapRequest take() {
        return list.poll();
    }
}
