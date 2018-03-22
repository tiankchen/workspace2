package lintcode;

import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.StringTokenizer;

public class HttpTest {
    public static void main(String args[]) throws IOException {
        String url = "http://www.baidu.com";
        HttpGet get = new HttpGet(url);
        HttpClient client = HttpClientBuilder.create().build();
        HttpResponse response = client.execute(get);
        HttpEntity entity = response.getEntity();
        byte[] bytes = EntityUtils.toByteArray(entity);
        String result = new String(bytes, "utf8");

        System.out.println(result);

        String line = new String("aaaaaabbcccdddbbaaaa");
        line.startsWith("a");

        StringTokenizer st = new StringTokenizer(line, "bb");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }


    }

}
