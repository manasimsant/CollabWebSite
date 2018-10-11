package org.dteja.CollaborationPortalBackEnd;

import org.dteja.config.DBConfig;
import org.dteja.dao.BlogDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan("org.dteja")
public class App {
	@Autowired
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class,
				BlogDaoImpl.class);
		context.scan("org.dteja");
		context.refresh();
		((AnnotationConfigApplicationContext) context).close();
	}
}
