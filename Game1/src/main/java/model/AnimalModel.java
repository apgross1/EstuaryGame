package model;

import java.util.HashMap;

import enums.Direction;
import models.AnimalModelAbstract;

public class AnimalModel extends AnimalModelAbstract {
	private int locX;
	private int locY;
	private boolean emptyHanded;
	private HashMap animations;
	private Direction currDir;
	
	@Override
	public void healthUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void healthDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pickUp(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	public int getLocX() {
		return locX;
	}

	public void setLocX(int locX) {
		this.locX = locX;
	}
	
	public int getLocY() {
		return locY;
	}

	public void setLocY(int locY) {
		this.locY = locY;
	}

}
