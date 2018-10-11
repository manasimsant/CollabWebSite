package org.dteja.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Blog

{
	@Id
	@GeneratedValue

	@Column
	private int BlogId;
	@Column
	private String BlogName;
	@Column
	private String BlogDescription;
	@Column
	private Date BlogDate;
	@Column
	private String LoginName;
	@Column
	private String Status;
	@Column
	private int Likes;
	@Column
	private int Dislikes;

	public int getBlogId() {
		return BlogId;
	}

	public void setBlogId(int blogId) {
		BlogId = blogId;
	}

	public String getBlogName() {
		return BlogName;
	}

	public void setBlogName(String blogName) {
		BlogName = blogName;
	}

	public String getBlogDescription() {
		return BlogDescription;
	}

	public void setBlogDescription(String blogDescription) {
		BlogDescription = blogDescription;
	}

	public Date getBlogDate() {
		return BlogDate;
	}

	public void setBlogDate(Date blogDate) {
		BlogDate = blogDate;
	}

	public String getLoginName() {
		return LoginName;
	}

	public void setLoginName(String loginName) {
		LoginName = loginName;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public int getLikes() {
		return Likes;
	}

	public void setLikes(int likes) {
		Likes = likes;
	}

	public int getDislikes() {
		return Dislikes;
	}

	public void setDislikes(int dislikes) {
		Dislikes = dislikes;
	}

}