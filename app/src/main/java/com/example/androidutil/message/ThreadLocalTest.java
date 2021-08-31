package com.example.androidutil.message;

class ThreadLocalTest {

    private ThreadLocal<Boolean> booleanThreadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        new ThreadLocalTest().test();
    }

    private void test(){
        booleanThreadLocal.set(true);
        System.out.println("main---"+booleanThreadLocal.get());

        new Thread("thread1--"){
            @Override
            public void run() {
                booleanThreadLocal.set(false);
                System.out.println("thread1--"+booleanThreadLocal.get());
            }
        }.start();

        new Thread("thread2--"){
            @Override
            public void run() {
                System.out.println("thread2--"+booleanThreadLocal.get());
            }
        }.start();

    }
}
