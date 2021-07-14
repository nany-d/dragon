package com.qa.dragons;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // Tells Spring to make an instance of this class.
public class DragonController {

	// dependency
	private DragonServices services;

	// spring injects it into class
	public DragonController(DragonServices services) {
		super();
		this.services = services;
	}

	@PostMapping("/createDragon") // MAPS a POST request to "/createDragon" to this method
	public void createDragon(@RequestBody Dragon dragon) {
		services.createDragon(dragon);
	}

	@GetMapping("/getDragons")
	public List<Dragon> getDragons() {
		return services.getDragons();
	}

	@PutMapping("/putDragons/{id}")
	public Dragon replace(@PathParam("name") String name, @PathParam("age") int age,
			@PathParam("cuteness") int scariness, @PathVariable int id) {
		return services.replace(name, age, scariness, id);
	}

	// 1?name=Carl&age=3&cuteness=8
	// or can use @RequestBody to input a Kitten in the body.

	@DeleteMapping("/deleteDragon/{id}")
	public String deleteDragon(@PathVariable int id) {
		return services.deleteDragon(id);
	}

}
