import static org.junit.Assert.*;

import org.junit.Test;

import model.AnimalModel;

public class Game1Tests {
	//Low level tests:
	//
	//
	//
	//High level tests:
	//Wave hit (initial)
	//Wave hit (after round) (Covers BarModel)
	//Random spawning
	//Pickup
	//Game start (tests timer)
	//Game end (tests timer as well)
	//Movement of animal
	
	
	//AnimalModel
	@Test
	public void testPickUp() {
		AnimalModel myAnimal = new AnimalModel();
		myAnimal.pickUp(myAnimal.getLocX(), myAnimal.getLocY());
	}

}
