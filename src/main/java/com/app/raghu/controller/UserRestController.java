package com.app.raghu.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.raghu.entity.Role;
import com.app.raghu.entity.User;

@RestController
@RequestMapping("/user")
public class UserRestController 
{
	@GetMapping("/one")
	public ResponseEntity<User> getOneObj()
	{
		User ob=new User(101,"ABC","Dev","Abhi123",
				Set.of("P1","P2"),
				Map.of("M1","A","M2","B")
				);
		
		ResponseEntity<User> response=new ResponseEntity<>(ob,HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Role>> getAllRoles()
	{
		List<Role> roles=Arrays.asList(
				new Role(1100,"ADMIN"),
				new Role(1102,"QA"),
				new Role(1103,"BA")
				);
		
		ResponseEntity<List<Role>> response=new ResponseEntity<>(roles,HttpStatus.OK);
		return response;
	}
}
