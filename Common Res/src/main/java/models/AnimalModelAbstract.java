package models;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;

import enums.Direction;

public abstract class AnimalModelAbstract {
	private int locX;
	private int locY;
	private int health;
	private boolean emptyHanded;
	private HashMap<Direction, ArrayList<BufferedImage>> animations;
	private Direction currDir;
	
	public abstract void healthUp();
	public abstract void healthDown();
	public abstract void pickUp(int x, int y);
	

}
