package model;

import java.util.LinkedList;

import model.Persona;
import processing.core.PApplet;

public class Logic {

	int number;

	LinkedList<Persona> personaList;

	String[] data;
	String[] dataSplit;
	String stat;
	PApplet app;

	public Logic(PApplet app) {
		this.app = app;
		
		data = app.loadStrings("data/data.txt");
		this.personaList = new LinkedList<Persona>();

		for (int i = 0; i < data.length; i++) {
			dataSplit = data[i].split(",");
			stat = dataSplit[0];
			number = Integer.parseInt(dataSplit[1]);

			for (int j = 0; j < number; j++) {
				if (stat.equals("personas sanas")) {
					personaList.add(new Pure(app));
				}
			}
			for (int m = 0; m < number; m++) {
				if (stat.equals("personas infectadas")) {
					personaList.add(new Infected(app));
				}
			}
			for (int n = 0; n < number; n++) {
				if (stat.equals("personas recuperadas")) {
					personaList.add(new Cured(app));
				}
			}

		}
	}
		
		
		  
		
		
	

	public LinkedList<Persona> getpersonaList() {
		return personaList;
	}
	
	
	
	
	

}
