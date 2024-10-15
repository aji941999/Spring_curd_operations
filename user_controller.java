package com.Curd_operation_spring_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Curd_operation_spring_entity.user;

import com.Curd_operation_spring_serives.userserives_imp;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/users")
public class user_controller {
	@Autowired
	private userserives_imp serives;
	
	@PostMapping
	public ResponseEntity<user>creatuser(@RequestBody user a){
		user saveuser=serives.creatuser(a);
		return new ResponseEntity<user>(saveuser,HttpStatus.CREATED);	
	}
	@GetMapping("{id}")
	public ResponseEntity<user>getuserbyid(@PathVariable("id")long b){
		user use=serives.getuserbyid(b);
		return new ResponseEntity<>(use,HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity <List<user>>getalluser(){
		List<user> use=serives.getalluser();
		return new ResponseEntity<>(use,HttpStatus.OK);
		
	}
	@PutMapping
	public ResponseEntity<user>updateuser(@PathVariable("id") long c,@RequestBody user m ){
	m.setId(c);
	user updateuser=serives.updateuser(m);
		return new ResponseEntity<>(updateuser,HttpStatus.OK);
		
	}
	@DeleteMapping
	public ResponseEntity<String>deletuser(@PathVariable("id")long d){
		serives.deletuser(d);
		return new ResponseEntity<>("user succefully delet",HttpStatus.OK);
		
	}

}
