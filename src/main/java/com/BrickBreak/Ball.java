//Miguel Mirabal Q
// Class draws and creates the methods for the ball to be able to move and be on the screen 

package com.BrickBreak;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	// your code here!

	// don't forget you need instance variables:
	private int x;
	private int y;
	private int size;
	private int xVelocity = 1;
	private int yVelocity = 1;

	// constructor(s):
	public Ball(int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.size = size;
	}

	// methods:

	// precondition: non null int
	// postcondition: draws the ball on screen
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval(x, y, size, size);
	}

	// precondition: none
	// postcondition: moves the ball
	public void move() {
		x += xVelocity;
		y += yVelocity;
	}

	// precondition: none
	// postcondition: returns the x value
	public int getXpos() {
		return x;
	}

	// precondition: none
	// postcondition: returns the Y value
	public int getYpos() {
		return y;
	}

	// precondition: none
	// postcondition: returns the size value
	public int getSize() {
		return size;
	}

	// precondition: non null integer
	// postcondition: sets the X velocity value to the integer stated
	public void setXVelocity(int velocity) {
		this.xVelocity = velocity;
	}

	// precondition: non null integer
	// postcondition: sets the Y velocity value to the integer stated
	public void setYVelocity(int velocity) {
		this.yVelocity = velocity;
	}

	// precondition: non null integer
	// postcondition: sets the X value to the integer stated
	public void setX(int x) {
		this.x = x;
	}

	// precondition: a non null integer
	// postcondition: sets the Y value to the integer stated
	public void setY(int y) {
		this.y = y;
	}

	// precondition: none
	// postcondition: reverses the X velocity value
	public void reverseX() {
		xVelocity = -xVelocity;
	}

	// precondition: none
	// postcondition: reverses the Y velocity value
	public void reverseY() {
		yVelocity = -yVelocity;
	}
}
