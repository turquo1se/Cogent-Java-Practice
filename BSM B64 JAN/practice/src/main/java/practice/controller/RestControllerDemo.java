package practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RestControllerDemo {
	
	@GetMapping("/{x}")
	public ResponseEntity<String> createData(@PathVariable int x) {
		System.out.println("value="+x);
		ResponseEntity<String> res = new ResponseEntity<String>("From save " + x, HttpStatus.OK);
		return res;
	}
	@GetMapping("/find") 
	public String fetchData() {
		return "Welcome to Tech";
	}
	
	
}