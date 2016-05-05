package org.irm.sched.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Schedule
{
	private Date date;
	private List<Member> members = new ArrayList<>(0);
	private String remarks;

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public List<Member> getMembers()
	{
		return members;
	}

	public void setMembers(List<Member> members)
	{
		this.members = members;
	}

	public String getRemarks()
	{
		return remarks;
	}

	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}

}
