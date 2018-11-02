package org.dteja.CollaborationPortal;

import org.dteja.config.DBConfig;
import org.dteja.models.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	@Autowired
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class, Blog.class);

		

	}
}