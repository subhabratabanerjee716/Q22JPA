package com.Subha.ineuron.q22.Q22.RestController;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Subha.ineuron.q22.Q22.Dao.UserService;
import com.Subha.ineuron.q22.Q22.Entity.User;

@RestController
public class Controller {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/getusers")
	public ResponseEntity<List<User>> getAll(){
		
		List<User> u=null;
		
		u=userService.getUsers();
		
		if(u==null) {
			
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			
		}
		
		return ResponseEntity.of(Optional.of(u));
		
	}
	
	@PostMapping("/saveusers")
	public ResponseEntity<User> post(@RequestBody User user){
		
		User u=userService.postusers(user);
		
		if(u==null) {
			
		return	ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
			
		}
		
		return ResponseEntity.of(Optional.of(u));
		
		
		
	}

}
