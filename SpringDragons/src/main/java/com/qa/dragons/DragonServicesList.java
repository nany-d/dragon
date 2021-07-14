package com.qa.dragons;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.stereotype.Service;

public class DragonServicesList implements DragonServices {

	List<Dragon> dragons = new ArrayList<>();

	@Override
	public void createDragon(Dragon dragon) {
		dragons.add(dragon);
		System.out.println(dragon.getName() + " was added to list");
	}

	@Override
	public List<Dragon> getDragons() {
		for (Dragon k : dragons) {
			System.out.println(k.toString());
		}
		return dragons;
	}

	@Override
	public Dragon replace(String name, int age, int scariness, int id) {
		dragons.get(id).setName(name);
		dragons.get(id).setAge(age);
		dragons.get(id).setScariness(scariness);
		return dragons.get(id);
	}

	@Override
	public String deleteDragon(int id) {
		dragons.remove(id);
		return "Deleted dragon at index " + id;
	}

}
