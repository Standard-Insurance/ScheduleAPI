package org.irm.sched.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Schedule
{
	private Calendar date;
	private String remarks;
	private List<Member> members = new ArrayList<>(0);
	
	public Schedule(){}
	
	public Schedule(Calendar date, String remarks, List<Member> members)
	{
		super();
		this.date = date;
		this.remarks = remarks;
		this.members = members;
	}

	public Calendar getDate()
	{
		return date;
	}

	public void setDate(Calendar date)
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
