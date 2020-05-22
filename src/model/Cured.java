package model;

import processing.core.PApplet;

public class Cured extends Persona{

	public Cured( PApplet app) {
		super(app);
		this.status=2;
		// TODO Auto-generated constructor stub
	}

	public void paint () {
		app.noStroke();
		app.fill(0,0,255);
		app.ellipse(this.PosX,this.PosY,this.tam,this.tam);
		}
		

}
