package com.bawei.huwanjun.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.InflaterInputStream;

/**
 * author: 斛万珺
 * data: 2019/11/27 09:9:22
 * function:
 */
public class NetUtil {
    //单例模式
    private NetUtil(){

    }
    private NetUtil util=new NetUtil();

    private static  NetUtil getInstance(){
        return null;
    }

    //网络判断
    public static boolean NetUtil(Context context){
        ConnectivityManager manager=(ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info=manager.getActiveNetworkInfo();
        if (info!=null){
            return info.isConnected();
        }

        return false;
    }

    public static String getData(String str){
        try {
            URL url=new URL(str);
            HttpURLConnection conn=(HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.setReadTimeout(5000);
            conn.setConnectTimeout(5000);
            int code=conn.getResponseCode();
            if (code==200){
                InputStream inputStream=conn.getInputStream();
                String json=streamToJson(inputStream);
                return json;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Bitmap getPic(String str){
        try {
            URL url=new URL(str);
            HttpURLConnection conn=(HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.setReadTimeout(5000);
            conn.setConnectTimeout(5000);
            int code=conn.getResponseCode();
            if (code==200){
                InputStream inputStream=conn.getInputStream();
                Bitmap bitmap= BitmapFactory.decodeStream(inputStream);
                return bitmap;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static String streamToJson(InputStream inputStream)throws  Exception{
        InputStreamReader reader=new InputStreamReader(new InflaterInputStream(inputStream));
        StringBuilder builder=new StringBuilder();
        String temp="";

        while ((temp=reader.getEncoding())!=null){

            return builder.toString();
        }


        reader.close();
        return builder.toString();
    }
}
