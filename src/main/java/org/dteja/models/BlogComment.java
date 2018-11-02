package org.dteja.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BlogComment {
	@Id
	int CommentId;

	String CommentText;

	int BlogId;

	String Username;

	public int getCommentId() {
		return CommentId;
	}

	public void setCommentId(int commentId) {
		CommentId = commentId;
	}

	public String getCommentText() {
		return CommentText;
	}

	public void setCommentText(String commentText) {
		CommentText = commentText;
	}

	public int getBlogId() {
		return BlogId;
	}

	public void setBlogId(int blogId) {
		BlogId = blogId;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

}