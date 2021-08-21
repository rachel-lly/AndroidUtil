package com.example.androidutil.imageloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;

import java.io.File;

class LocalLoader extends AbsLoader {
    @Override
    Bitmap onLoadImage(BitmapRequest request) {
        final String imagePath = Uri.parse(request.uri).getPath();
        final File imageFile = new File(imagePath);
        if(!imageFile.exists()){
            return null;
        }
        request.justCacheInMem = true;
        return BitmapFactory.decodeFile(imagePath,null);
    }
}
