package se.iuh.demo.ae;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class helloworld {
	@GetMapping("/hello")
	public String Helloworld() {
		return "hello world";
	}
	
	@GetMapping("/user")
	public List<User> user() {
		List<User> list = new ArrayList<User>();
		list.add(new User(0, "ngan"));
		list.add(new User(1, "ngan"));
//		User user= new User(1, "ngandeptrai");
		return list;
	}
}
