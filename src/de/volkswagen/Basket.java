package de.volkswagen;

import java.util.*;

public class Basket<T> {
    private Set<T> storage;

    
    public Basket() {
        storage = new HashSet<>();
    }

    
    
//    public void add(Fruit... fruitArray) {
//        fruits.addAll(Arrays.asList(fruitArray));
//    }
    
    public void add(T...objects) {
    	this.storage.addAll(Arrays.asList(objects));
//    	for (Fruit fruit : fruits) {
//    		this.fruits.add(fruit);
//    	}
    }

    public void remove(T objects) {
        storage.remove(objects);
    }

    public boolean contains(T objects) {
        return storage.contains(objects);
    }

    public List<T> getContent() {
        return new ArrayList<>(storage);
    }

//    public List<T> getContentSorted() {
//        List<T> sortedContent = new ArrayList<>(storage);
//        Collections.sort(sortedContent);
//        return sortedContent;
//    }


    

}

