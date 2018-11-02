package org.dteja.dao;

import java.util.List;

import org.dteja.models.Blog;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("blogDao")
@Transactional
public class BlogDaoImpl implements BlogDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addBlog(Blog blog) {
		try {
			sessionFactory.getCurrentSession().save(blog);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	@Override
	public boolean updateBlog(Blog blog) {
		try {
			sessionFactory.getCurrentSession().update(blog);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@Override
	public boolean deleteBlog(Blog blog) {
		try {
			sessionFactory.getCurrentSession().delete(blog);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	@Override
	public Blog getBlog(int BlogId) {
		Session session = sessionFactory.openSession();
		Blog blog = (Blog) session.get(Blog.class, BlogId);
		session.close();
		return blog;
	}

	@Override
	public List<Blog> getAllBlogs() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Blog");
		List<Blog> listAllBlogs = query.list();
		return listAllBlogs;
	}

}
