package com.ztt.test;

import net.sf.json.JSONObject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.ztt.model.TradeModel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationContext*.xml")
public class RestTest {

	@Test
	public void test_save() {
		TradeModel tm = new TradeModel();
		tm.setEndModified("endModified");
		tm.setStartModified("startModified");
		tm.setStatus("status");

		RestTemplate restTemplate = new RestTemplate();

		String JSONInput = JSONObject.fromObject(tm).toString();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> request = new HttpEntity<String>(JSONInput, headers);

		String res = restTemplate.postForObject("http://localhost:9000/mvc/helloworld/post", request,String.class);
		System.out.println(res);
	}

}