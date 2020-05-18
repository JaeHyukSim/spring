package com.sist.xml;
// newssearch.naver.com/search.naver?where=rss&query=��ȭ
// http://newssearch.naver.com/search.naver?where=rss&query=%EC%98%81%ED%99%94
import java.util.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Component;

import java.net.*;

@Component
public class NewsManager {
   public List<Item> newsAllData(String fd)
   {
	   List<Item> list=new ArrayList<Item>();
	   try
	   {
		   JAXBContext jc=JAXBContext.newInstance(Rss.class);
		   Unmarshaller un=jc.createUnmarshaller();
		   URL url=new URL("http://newssearch.naver.com/search.naver?where=rss&query="
				          +URLEncoder.encode(fd, "UTF-8"));
		   Rss rss=(Rss)un.unmarshal(url);
		   
		   list=rss.getChannel().getItem();
	   }catch(Exception ex){}
	   return list;
   }
}
