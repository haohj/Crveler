package http.client;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class MyJsoup {
	public static void main(String[] args) throws Exception {
		Document doc = Jsoup.connect("http://www.itcast.cn/").get();
		
	}
}
