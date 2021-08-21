package com.example.androidutil.imageloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.net.HttpURLConnection;
import java.net.URL;

class UrlLoader extends AbsLoader{
    @Override
    Bitmap onLoadImage(BitmapRequest request) {

        Bitmap bitmap = null;

        try {
            URL url = new URL(request.uri);
            final HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            bitmap = BitmapFactory.decodeStream(connection.getInputStream());
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }
}
