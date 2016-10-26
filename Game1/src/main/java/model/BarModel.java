package model;

import models.BarModelAbstract;

public class BarModel extends BarModelAbstract{
	
	BarModel(){
		this.name = "Game One ~ Protect the marsh lands by building barriers!";
		maxLevel = 12;	
	}
	
	public void increase() {
		status++;
	}

	public void decrease() {
		status--;
	}
}
