package model;

import processing.core.PApplet;

public class Persona {
int status;
	int PosX;
	int PosY;
	int tam;
	int vel;
	int r;
	int g;
	int b;
	PApplet app;
	int dir;
	
	public Persona(PApplet app) {
		this.PosX=(int)app.random(0,500);
		this.PosY=(int)app.random(0,500);
		this.vel=5;
		this.tam=7;
		this.dir = (int)app.random(1,5);
		this.app=app;
		
	}
	
	public void paint () {
		
	}
	
	public void move() {
		
		if (this.dir == 1) {
			this.PosX += this.vel;
			this.PosY += this.vel;
		}
		
		if (this.dir == 2) {
			this.PosX -= this.vel;
			this.PosY -= this.vel;
		}
		
		if (this.dir == 3) {
			this.PosX -= this.vel;
			this.PosY += this.vel;
		}
		
		if (this.dir == 4) {
			this.PosX += this.vel;
			this.PosY -= this.vel;
		}
		
	}
	
	
	
	

	public int getPosX() {
		return PosX;
	}

	public void setPosX(int posX) {
		PosX = posX;
	}

	public int getPosY() {
		return PosY;
	}

	public void setPosY(int posY) {
		PosY = posY;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}
	
	
	
	
	
	
	
	
}
