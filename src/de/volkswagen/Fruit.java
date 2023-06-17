package de.volkswagen;

import java.time.LocalDate;

public class Fruit extends Food{

	public Fruit(String name, LocalDate mindesthaltbarkeitsdatum) {
		super(name, mindesthaltbarkeitsdatum);
	}


	@Override
	public String toString() {

		return "Name: " + getName() + "; Mindesthaltbarkeitsdatum: " + getMindesthaltbarkeitsdatum();

	}


	@Override
	public int hashCode() {
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}


	
	

}
