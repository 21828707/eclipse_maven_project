package com.study.aop1.service;

import com.study.aop1.dao.ArticleDao;
import com.study.aop1.vo.Article;

public class WriteArticleServiceImpl implements WriteArticleService{
	private ArticleDao articleDao;
	
	public WriteArticleServiceImpl(ArticleDao articleDao) {
		// TODO Auto-generated constructor stub
		this.articleDao = articleDao;
	}
	@Override
	public void write(Article article) {
		// TODO Auto-generated method stub 
		System.out.println("[WriteArticleServiceImpl] write()");
		articleDao.insert(article);
	}
}
