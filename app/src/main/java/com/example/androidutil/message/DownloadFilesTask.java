package com.example.androidutil.message;

import android.os.AsyncTask;

import java.net.URL;

class DownloadFilesTask extends AsyncTask<URL,Integer,Long> {

    @Override
    protected Long doInBackground(URL... urls) {

        int cnt = urls.length;
        long totalSize = 0;
        for(int i=0;i<cnt;i++){
            totalSize += DownLoader.downloadFile(urls[i]);
            //进度发生变化调用publishProgress(Process process)
            publishProgress((int) ((i/(float)cnt)*100));
            if(isCancelled()){
                break;
            }
        }

        return totalSize;
    }

    @Override
    protected void onProgressUpdate(Integer... process) {
        setProgressPercent(process[0]);
    }

    @Override
    protected void onPostExecute(Long result) {
        showDialog("Download"+result+" bytes");
    }

    private void setProgressPercent(Integer process) {
    }

    private void showDialog(String s) {
    }

    private static class DownLoader {
        public static long downloadFile(URL url) {
            return 0L;
        }
    }
}
