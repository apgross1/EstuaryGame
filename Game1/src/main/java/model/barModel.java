package model;

import models.BarModelAbstract;

public class barModel extends BarModelAbstract{
	
	barModel(){
		name = "Game One ~ Protect the marsh lands by building bariors!";
		maxLevel = 12;	
	}
	
	public void increase() {
		status++;
	}

	public void decrease() {
		status--;
	}
}
