package model;

import processing.core.PApplet;

public class Pure extends Persona{

	public Pure( PApplet app) {
		super(app);
		this.status=0;
		// TODO Auto-generated constructor stub
	}
	
	public void paint () {
		app.noStroke();
		app.fill(0,255,0);
		app.ellipse(this.PosX,this.PosY,this.tam,this.tam);
		}
		
	

}
