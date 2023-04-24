package com.NagaAkhilProject.DogDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/**
 * 
 * @author S549701 - Naga Akhil Chaparala
 *
 */
@Component
@Scope (value = "prototype")
public class Dog {
	private int id;
	private String name;
	private String breed;
	@Autowired
	private Trainer trainer;
	
	public Dog() {
		id = 423;
		name = "About to Give";
		breed = "Need to Find";
		System.out.println("Object Created");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", breed=" + breed + "]" + "\n"+
				trainer.toString();
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
}
