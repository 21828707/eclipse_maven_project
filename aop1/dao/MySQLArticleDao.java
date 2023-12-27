package com.study.aop1.dao;

import com.study.aop1.vo.Article;

public class MySQLArticleDao implements ArticleDao {
	@Override
	public void insert(Article article) {
		// TODO Auto-generated method stub
		System.out.println("[MySQLArticleDao] insert()");
	}
}
