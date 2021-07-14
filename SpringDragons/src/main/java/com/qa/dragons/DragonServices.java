package com.qa.dragons;

import java.util.List;

public interface DragonServices {

	public void createDragon(Dragon dragon);

	public List<Dragon> getDragons();

	public Dragon replace(String name, int age, int scariness, int id);

	public String deleteDragon(int id);

}
