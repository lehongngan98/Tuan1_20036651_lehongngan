package se.iuh.demo.ae;

import org.springframework.web.bind.annotation.RestController;


public class User {
	Integer id;
	String name;
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
