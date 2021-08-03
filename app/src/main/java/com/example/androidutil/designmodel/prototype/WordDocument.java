package com.example.androidutil.designmodel.prototype;

import androidx.annotation.NonNull;

import java.util.ArrayList;

class WordDocument implements Cloneable {

    private String mText;

    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocument() {
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {

        WordDocument doc = (WordDocument) super.clone();
        doc.mImages = (ArrayList<String>) this.mImages.clone();
        doc.mText = this.mText;
        return doc;

    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getImages() {
        return mImages;
    }

    public void setImages(ArrayList<String> mImages) {
        this.mImages = mImages;
    }

    @Override
    public String toString() {
        return "WordDocument{" +
                "mText='" + mText + '\'' +
                ", mImages=" + mImages +
                '}';
    }
}
