package es.elorrietaErrekamari.curso.bbdd.pojo;

import java.sql.Date;
import es.elorrietaErrekamari.curso.bbdd.pojo.Zoo;
import es.elorrietaErrekamari.curso.bbdd.pojo.Animal;

public class ZooHasAnimal {

	private int id = 0;
	private Zoo zoo = null;
	private Animal animal = null;
	private char sexo = (Character) null;
	private Date año = null;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Zoo getZoo() {
		return zoo;
	}
	public void setZoo(Zoo zoo) {
		this.zoo = zoo;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Date getAño() {
		return año;
	}
	public void setAño(Date año) {
		this.año = año;
	}
	
	
	
}
