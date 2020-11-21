package Demo.Day18.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class urltest {
    public static void main(String[] args) {
        try {
            //拿到地址判断连接资源大小
            URL url=new URL("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1605675663062&di=8add27a7fda2744926909ac009590aa6&imgtype=0&src=http%3A%2F%2Fattach.bbs.miui.com%2Fforum%2F201408%2F07%2F213601f2xz7usscm2z1mjh.jpg") ;
            URLConnection urlConnection=url.openConnection();
            HttpURLConnection httpURLConnection= (HttpURLConnection) urlConnection;
            InputStream is= httpURLConnection.getInputStream();
            OutputStream os=new FileOutputStream("D:\\x.jpg");
            byte[] bytes=new byte[1024];
            int length=0;
            while (-1!=(length= is.read(bytes))){
                os.write(bytes,0,length);
            }
            is.close();
            os.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
