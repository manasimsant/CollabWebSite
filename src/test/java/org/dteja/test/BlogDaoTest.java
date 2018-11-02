package org.dteja.test;

import static org.junit.Assert.assertTrue;

import org.dteja.dao.BlogDao;
import org.dteja.models.Blog;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BlogDaoTest {

@Autowired
static BlogDao blogDao;
	
	@BeforeClass
	public static void initialize() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("DBConfig.class");
		context.scan("org.dteja");
//		context.refresh();
		blogDao = (BlogDao) context.getBean("BlogDao");
	}
	
	@Test
	public void addBlogTest() {

		Blog blog = new Blog();
		blog.setBlogName("Sudhir");
		blog.setBlogDescription("Its a very nice blog");
		blog.setDislikes(1);
		blog.setLikes(1);
		blog.setLoginName("ManasiMSant@gmail.com");
		blog.setStatus("Liked a video");

		assertTrue("Problem in adding Blog", blogDao.addBlog(blog));

	}

}