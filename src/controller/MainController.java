package controller;

import java.util.LinkedList;

import model.Logic;
import model.Persona;
import processing.core.PApplet;

public class MainController {
	Logic logicControl;
	
	
	public MainController(PApplet app) {
		logicControl = new Logic(app);
	}

	
	public LinkedList<Persona> getpersonaList() {
		return logicControl.getpersonaList();
	}
	
}
