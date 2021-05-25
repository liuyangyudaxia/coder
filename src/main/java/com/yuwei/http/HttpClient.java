package com.yuwei.http;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * Http工具类，原生HttpURLConnection
 * @author yuwei
 * @date 2021/5/20 23:40
 */
public class HttpClient {
    /**
     * Get请求
     * @param httpUrl 请求地址
     * @return 相应结果
     */
    public static String doGet(String httpUrl) {
        InputStream is;
        BufferedReader br = null;
        String result = null;
        try {
            //创建远程url对象
            URL url = new URL(httpUrl);
            //打开连接
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            //设置连接方式：get
            connection.setRequestMethod("GET");
            //服务器连接超时时间
            connection.setConnectTimeout(10000);
            //读取远程返回的数据时间
            connection.setReadTimeout(60000);
            //发送请求
            connection.connect();
            //获取输入流
            if (connection.getResponseCode() == 200) {
                is = connection.getInputStream();
                br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
                StringBuilder sbf = new StringBuilder();
                String temp;
                while ((temp = br.readLine()) != null) {
                    sbf.append(temp);
                    sbf.append("\r\n");
                }
                result = sbf.toString();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

    /**
     * Post请求
     * @param httpUrl 请求地址
     * @param param   请求参数
     * @return 返回结果
     */
    public static String doPost(String httpUrl, String param) {
        BufferedReader br = null;
        String result = null;
        try {
            URL url = new URL(httpUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setConnectTimeout(10000);
            connection.setReadTimeout(10000);
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestProperty("Content-Type", "application/x-www/form-urle");
            OutputStream os = connection.getOutputStream();
            os.write(param.getBytes());
            if (connection.getResponseCode() == 200) {
                InputStream is = connection.getInputStream();
                br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
                StringBuilder sb = new StringBuilder();
                String temp;
                while ((temp = br.readLine()) != null) {
                    sb.append(temp);
                    sb.append("\r\n");
                }
                result = sb.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
}
