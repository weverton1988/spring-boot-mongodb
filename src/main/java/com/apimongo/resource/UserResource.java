package com.apimongo.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apimongo.domain.User;
import com.apimongo.dto.UserDto;
import com.apimongo.service.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@Autowired
	private UserService userService;
	
	@GetMapping
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<UserDto>> findAll(){
		List<User> list = userService.findAll();
		List<UserDto> listDto = list.stream().map(x -> new UserDto(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}

	@GetMapping
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<UserDto> findById(@PathVariable String id){
		User obj = userService.findById(id);
		return ResponseEntity.ok().body(new UserDto(obj));
	}
	
	
	
}
