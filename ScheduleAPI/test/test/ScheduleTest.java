package test;


import org.codehaus.jackson.map.ObjectMapper;
import org.irm.sched.model.Schedule;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:WebContent/WEB-INF/resources/applicationContext.xml", "file:WebContent/WEB-INF/resources/applicationContext-servlet.xml"})
@WebAppConfiguration
public class ScheduleTest
{
	@Autowired WebApplicationContext wac; 

    private MockMvc mockMvc;

    @Before
    public void setup() 
    {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }
	
	@Test
	public void testGetSchedule() throws Exception
	{
		
		MvcResult result = this.mockMvc.perform(get("/schedule/list")
				.accept(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.[0].remarks").value("Don't be late!"))
				.andReturn();
//		String content = result.getResponse().getContentAsString();
//		System.out.println(content);
//		
//		ObjectMapper mapper = new ObjectMapper();
//		List<Schedule> list = Arrays.asList(mapper.readValue(content, Schedule[].class));
//		for(Schedule sched : list)
//		{
//			System.out.println(sched.getRemarks());
//		}
	}

}
