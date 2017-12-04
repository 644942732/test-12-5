package com.example.demo;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class Mvcontroller {

	@Autowired
	ObjectMapper objectMapper;


	@RequestMapping(value = "demo9")
	@ResponseBody
	public void demo9(String json) throws JsonParseException, JsonMappingException, IOException {
		User user = objectMapper.readValue(json, User.class);
		System.out.println(user);

	}

	@RequestMapping(value = "demo10")
	@ResponseBody
	public List<User> demo10() {
		return Arrays.asList(new User("张三", "15"), new User("李四", "14"), new User("王五", "15"), new User("赵六", "13"),
				new User("田七", "12"));
	}
}
