package com.BrickBreak;

import java.awt.Graphics;

public class Ball {
	// your code here!

	// don't forget you need instance variables:
	private int x;
	private int y;
	private int size;
	private int xVelocity = 2;
	private int yVelocity = 2;

	// constructor(s):
	public Ball(int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.size = size;
	}

	// methods:
	public void draw(Graphics g) {
		g.fillOval(x, y, size, size);
	}

	public void move() {
		x += xVelocity;
		y += yVelocity;
	}

	public int getXpos() {
		return x;
	}

	public int getYpos() {
		return y;
	}

	public int getSize() {
		return size;
	}

	public void setXVelocity(int velocity) {
		this.xVelocity = velocity;
	}

	public void setYVelocity(int velocity) {
		this.yVelocity = velocity;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void reverseX() {
		xVelocity = -xVelocity;
	}

	public void reverseY() {
		yVelocity = -yVelocity;
	}
}
