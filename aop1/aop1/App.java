package com.study.aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.aop1.service.WriteArticleService;
import com.study.aop1.vo.Article;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String[] configLocations = new String[] {"aop1.xml"};
    	ApplicationContext atx = new ClassPathXmlApplicationContext(configLocations);
    	
    	WriteArticleService articleService = atx.getBean("WriteArticleService", WriteArticleService.class);
    	
    	articleService.write(new Article());
    	
    	((ClassPathXmlApplicationContext)atx).close();
    }
}
