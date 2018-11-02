package org.dteja.dao;

import java.util.List;

import org.dteja.models.Job;

public interface JobDao {
	
	public boolean postJob(Job job);
	public boolean updateJob(Job job);
	public List<Job> listJobs(int jobid);
}
