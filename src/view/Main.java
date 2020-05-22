package view;

import processing.core.PApplet;

import java.util.LinkedList;

import model.Persona;
public class Main extends PApplet {
	LinkedList<Persona>personaList;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());

	}
	
	
	public void settings() {
	size(500,500);	
	}
	
	
	public void setup() {
	
	}
	
	
	public void draw() {
	background(0);
	
	for (int i = 0; i < personaList.size(); i++) {
		personaList.get(i).paint();
	
	}
	
	
	
	

}
}
