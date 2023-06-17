package de.volkswagen;

import java.time.LocalDate;
import java.util.Objects;

public class Drinks extends Food{

	private boolean isAlcoholic;

	public Drinks(String name, LocalDate mindesthaltbarkeitsdatum, boolean isAlcoholic) {
		super(name, mindesthaltbarkeitsdatum);
		this.isAlcoholic = isAlcoholic;
	}

	public boolean getIsAlcoholic() {
		return this.isAlcoholic;
	}

	@Override
	public String toString() {

		return "Name: " + getName() + "; Mindesthaltbarkeitsdatum: " + getMindesthaltbarkeitsdatum()
				+ "; Alkoholisch?: " + isAlcoholic;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(isAlcoholic);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Drinks other = (Drinks) obj;
		return isAlcoholic == other.isAlcoholic;
	}
	
	
	

//	@Override
//	public boolean equals(Object o) {
//		if (o istanceof Drinks) {
//			if (o == isAlcoholic) {
//				return "Ist ein Getränk und alkoholisch";
//			}
//			return "Ist ein Getränk";
//			
//		}
//		if (o instance of Fruit) {
//			return "Ist eine Fruit";
//		}
//		return "Ist kein Getränk oder Fruit!";
//	}
	
//	@Override
//	public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Drinks)) return false;
//        if (!super.equals(o)) return false;
//        Drinks drinks = (Drinks) o;
//        return isAlcoholic == drinks.isAlcoholic;
//    }

}
