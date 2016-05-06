package org.irm.sched.model;

public class Member
{
	private String name;
	private String task;

	public Member() { }
	
	public Member(String name, String task)
	{
		super();
		this.name = name;
		this.task = task;
	}


	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getTask()
	{
		return task;
	}

	public void setTask(String task)
	{
		this.task = task;
	}

}
