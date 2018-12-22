package com.you.http;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

/**
 * <一句话说明功能>
 * <功能详细描述>
 *
 * @author HX
 * @title <一句话说明功能>
 * @date 2018/12/22 15:37
 * @since <版本号>
 */
public class HttpUpFile {
    private Logger logger= LoggerFactory.getLogger(HttpUpFile.class);

    public String up(){
        final String remote_url = "http://192.168.1.99:8080/demo/file/upload";// 第三方服务器请求地址
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String result = "";
        try {
            String fileName = "";
            HttpPost httpPost = new HttpPost(remote_url);
            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            builder.addBinaryBody("file", new FileInputStream(""), ContentType.MULTIPART_FORM_DATA, fileName);// 文件流
            builder.addTextBody("filename", fileName);// 类似浏览器表单提交，对应input的name和value
            HttpEntity entity = builder.build();
            httpPost.setEntity(entity);
            HttpResponse response = httpClient.execute(httpPost);// 执行提交
            HttpEntity responseEntity = response.getEntity();
            if (responseEntity != null) {
                // 将响应内容转换为字符串
                result = EntityUtils.toString(responseEntity, Charset.forName("UTF-8"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
    public  String download(String path, String savePath, Integer width, Integer height) throws IOException {
        //CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
           // HttpGet httpget = new HttpGet(url);
            URL url = new URL(path.trim());
            //打开连接
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36");
//伪装成google的爬虫JAVA问题查询
            //httpget.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36");
// Execute HTTP request
           // System.out.println("executing request " + httpget.getURI());
            //HttpResponse response = httpclient.execute(httpget);

            File storeFile = new File("E:\\a.png");
            FileOutputStream output = new FileOutputStream(storeFile);
            if(200 == urlConnection.getResponseCode()){
                //得到输入流
                InputStream is =urlConnection.getInputStream();
                if (is != null) {
                    byte b[] = new byte[1024];
                    int j = 0;
                    while( (j = is.read(b))!=-1){
                        output.write(b,0,j);
                    }
                    output.flush();
                    output.close();
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        } finally {
            //httpclient.getConnectionManager().shutdown();
        }
        return "";

    }

}
