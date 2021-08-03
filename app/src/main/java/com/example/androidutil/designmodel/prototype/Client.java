package com.example.androidutil.designmodel.prototype;

import java.util.ArrayList;

class Client {

    public static void main(String[] args) {
        WordDocument originDoc = new WordDocument();
        originDoc.setText("--1--");
        originDoc.setImages(new ArrayList<>());
        originDoc.getImages().add("tupian 1");
        originDoc.getImages().add("tupian 2");

        System.out.println(originDoc.toString());
        try {
            //以 originDoc 为原型拷贝一份
            WordDocument doc2 = (WordDocument) originDoc.clone();
            doc2.setText("--2--");
            System.out.println(doc2.toString());
            System.out.println(originDoc.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
