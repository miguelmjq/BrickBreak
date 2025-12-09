package com.BrickBreak;

import java.awt.*;

public class Paddle {


	//your code here!


	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;
	//constructor(s):
	public Paddle (int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	//methods:

	//precondition: g is a non-null value
	//postcondition: draws the paddle on the screen
	public void draw(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
	}
	
	//precondition:
	//postcondition:
	public void move(){
		
	}

	//precondition: none
	//postcondition: returns the X value
	public int getX(){
		return x;
	}

	//precondition: none
	//postcondition: returns the Y value
	public int getY(){
		return y;
	}

	//precondition: none
	//postcondition: returns the width value
	public int getWidth(){
		return width;
	}

	//precondition: none
	//postcondition: returns the height value
	public int getHeight(){
		return height;
	}

	//precondition: none
	//postcondition: returns the velocity value
	public int getVelocity(){
		return velocity;
	}

	//precondition: a non null integer
	//postcondition: adds the integer to the velocity value
	public void addVelocity(int inc){
		this.velocity = velocity+inc;
	}

	//precondition: non null integer
	//postcondition: sets velocity to the integer stated
	public void setVelocity(int vel){
		this.velocity = vel;
	}

	//precondition: non null integer
	//postcondition: sets the x to the integer stated
	public void setX(int x){
		this.x=x;
	}
}
