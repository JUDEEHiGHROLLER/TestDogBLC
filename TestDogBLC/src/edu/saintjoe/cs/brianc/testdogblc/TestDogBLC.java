package edu.saintjoe.cs.brianc.testdogblc;

public class TestDogBLC {

	    private String name;
	    // this is creating a source for the name of the dog
	    private int weight;
	    // this is creating an integer for a number that represents the dogs weight	    
	    public void setName(String newName) {
	    	name = newName;
	    }
	    // this is allowing you to create a new dog's name
	    public void setWeight(int newWeight) {
	    	weight = newWeight;
	    }
	    // this is allowing you to assign a number to a new weight to a dog

	    public String getName() {
	    	return name;
	    }
	    // this is pulling the name of the dog
	    public int getWeight() {
	    	return weight;
	    }
	    // this is pulling the number for whatever you wanted the dog to weigh
	    public void bark() {
	    
	    	int pointless = 0;
	    	
	    	
	    	if (weight > 60 ) {
	          System.out.println("Woof!! Woof!! says " + name + " that weighs " + weight);
	    	// this is saying if the dogs weight is less than 60 than it will produce a noise of "woof"
	    	} else if (weight > 14 ) {
	    		System.out.println("Ruff!! Ruff!! says " + name + " that weighs " + weight);
	    	// this is saying the same as above, but if the dog is less than 14 pounds than it is saying "ruff"
	    	} else
	    		System.out.println("Yip!! Yip!! says " + name + " that weighs " + weight);
	    }// this is saying that the rest of the weights will be saying "yip"
	    
	    public int setBoth(String newName, int newWeight) {
	    	
	    	int oldWeight = weight;
	    	
	    	name = newName;
	    	weight = newWeight;
	    	return oldWeight;
	    }
	    	

	    public void eat() { }
	    public void chaseCat() { }
	}

