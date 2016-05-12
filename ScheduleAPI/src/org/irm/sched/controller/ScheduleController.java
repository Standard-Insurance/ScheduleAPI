package org.irm.sched.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;

import org.irm.sched.model.Member;
import org.irm.sched.model.Schedule;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="Schedule")
@RestController
public class ScheduleController
{
	@ApiOperation(value="Schedule List")
	@RequestMapping(value = "/schedule/list", method = RequestMethod.GET)
	public ResponseEntity<List<Schedule>> scheduleList()
	{
		return new ResponseEntity<List<Schedule>>(mockSchedule(), HttpStatus.OK);
	}
	
	private List<Schedule> mockSchedule()
	{
		List<Schedule> list = new ArrayList<>(0);
		list.add(new Schedule(new GregorianCalendar(2016, 04, 1), "Don't be late!", defaultMembers()));
		list.add(new Schedule(new GregorianCalendar(2016, 04, 8), "Don't be late! Dancers Please!", defaultMembers()));
		
		
		return list;
	}
	
	private List<Member> defaultMembers()
	{
		List<Member> list = new ArrayList<>(0);
		list.add(new Member("Angela Pimentel", "Song Leader"));
		list.add(new Member("Kevin Hubilla", "Lead Guitar"));
		list.add(new Member("Renz Corbito", "Drummer"));
		list.add(new Member("JM Javier", "Keyboard"));
		list.add(new Member("JP Ibañez", "Bass Guitar"));
		
		return list;
	}
	
}
