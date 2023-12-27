package com.jung.aop2.core;

import org.apache.commons.logging.Log;

import org.apache.commons.logging.LogFactory;

public class WriteArticleServiceImpl implements WriteArticleService {

	private Log log = LogFactory.getLog(getClass());
	
	private int articleId;
	
	@Override
	public Integer write(Article article) {
		// TODO Auto-generated method stub
		articleId++;
		if(log.isTraceEnabled()) {
			log.trace(this + "'s write method executed, Article id is"
					+ " " + articleId);
		}
		return articleId;
	}

}
