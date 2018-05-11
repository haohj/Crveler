package http.client;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.util.EntityUtils;

public class MyHttpClient {
	public static void main(String[] args)throws Exception {
		HttpClient hClient = new DefaultHttpClient();
		
		//访问超时设置
		hClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 5000);
		//发送超时设置
		hClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 5000);
		//设置代理服务器
		hClient.getParams().setParameter(ConnRouteParams.DEFAULT_PROXY, new HttpHost("111.126.94.80",808));
		
		HttpGet hGet = new HttpGet("http://www.itcast.cn/");
		HttpResponse response = hClient.execute(hGet);
		String content = EntityUtils.toString(response.getEntity(),"utf-8");
		System.out.println(content);
	}
}
