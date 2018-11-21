package com.hwk;

import com.hwk.dao.ImportDao;
import com.hwk.dao.UserDao;
import com.hwk.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexService indexService = ac.getBean(IndexService.class);
		IndexService indexService2 = ac.getBean(IndexService.class);
		ImportDao importDao = ac.getBean(ImportDao.class);
		indexService.query();
		System.out.println(indexService.hashCode()+"---"+indexService2.hashCode());
		importDao.hello();
		UserDao userDao = (UserDao) ac.getBean("userDao");
		userDao.list("aaaaaa");

	}
}
