package model;

import processing.core.PApplet;

public class Infected extends Persona{

	public Infected( PApplet app) {
		super(app);
		this.status=1;
		// TODO Auto-generated constructor stub
	}
	
public void paint () {
	app.noStroke();
	app.fill(255,0,0);
	app.ellipse(this.PosX,this.PosY,this.tam,this.tam);
	}
	
	
	

}
