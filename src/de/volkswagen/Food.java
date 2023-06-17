package de.volkswagen;

import java.time.LocalDate;
import java.util.Objects;


public abstract class Food implements Comparable<Food> {

	private String name;
	private LocalDate mindesthaltbarkeitsdatum;
	
	public Food(String name, LocalDate mindesthaltbarkeitsdatum) {
		this.name = name;
		this.mindesthaltbarkeitsdatum = mindesthaltbarkeitsdatum;
	}
	
	public String getName() {
		return this.name;
	}
	
	public LocalDate getMindesthaltbarkeitsdatum() {
		return this.mindesthaltbarkeitsdatum;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMindesthaltbarkeitsdatum(LocalDate mindesthaltbarkeitsdatum) {
		this.mindesthaltbarkeitsdatum = mindesthaltbarkeitsdatum;
	}
	
	
	@Override
	public String toString() {
		
		return "Name: " + this.name + "; Mindesthaltbarkeitsdatum: " + this.mindesthaltbarkeitsdatum;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mindesthaltbarkeitsdatum, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Food other = (Food) obj;
		return Objects.equals(mindesthaltbarkeitsdatum, other.mindesthaltbarkeitsdatum)
				&& Objects.equals(name, other.name);
	}
	
	@Override
	public int compareTo(Food other) {
	    int nameComparison = this.getName().compareTo(other.getName());

	    // Wenn die Namen nicht gleich sind, gib den Vergleichswert zurück
	    if (nameComparison != 0) {
	        return nameComparison;
	    }
	   
	    // Vergleiche die Lebensmittel basierend auf dem Mindesthaltbarkeitsdatum
	    return this.getMindesthaltbarkeitsdatum().compareTo(other.getMindesthaltbarkeitsdatum());
	}


	

	
	
}
