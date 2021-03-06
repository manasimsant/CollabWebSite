package org.dteja.dao;

import java.util.List;

import org.dteja.models.Blog;

public interface BlogDao 
{	
	public boolean addBlog(Blog blog);
	
	public boolean updateBlog(Blog blog);
	
	public boolean deleteBlog(Blog blog);
	
	public Blog getBlog(int  BlogId);
	
	public List<Blog> getAllBlogs();

}
