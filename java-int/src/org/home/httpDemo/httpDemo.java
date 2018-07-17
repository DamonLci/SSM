package org.home.httpDemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class httpDemo {
    public static void main(String[] args) {
        httpDemo ht=new httpDemo();
        System.out.println();
        ht.python("http://www.loveci.me");
    }

    public void python(String urls){
        String url = urls;
        InputStream is = null;
        HttpURLConnection con = null;
        URLConnection urlConnectio = null;
        try {
            URL url1 = new URL(url);
            urlConnectio=url1.openConnection();
            con = (HttpURLConnection) urlConnectio;
            con.setRequestMethod("GET");
            con.setRequestProperty("ACCEPT", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
            con.connect();
            is = con.getInputStream();
            byte[] content = new byte[1024];
            int len = 0;
            while ((len = is.read(content)) != -1) {
                System.out.println(new String(content, 0, len));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                
            }
        }
    }
}
