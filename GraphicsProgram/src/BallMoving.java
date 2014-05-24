import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
public class BallMoving extends GraphicsProgram {
	
	private double xVelocity;
	private double yVelocity;
	private GOval ball;
	private GOval golfball;
	private double gravity = 0.1;
	private int pauseInterval = 6;
	
	private double xPressed;
	private double yPressed;
	
	
	@Override
	public void mouseClicked(MouseEvent event) {
		println("mouse clicked!");
		xVelocity = -xVelocity;
		yVelocity = -yVelocity;
	}
	
	@Override
	public void mousePressed(MouseEvent event) {
		xPressed = event.getX();
		yPressed = event.getY();
	}
	
	@Override
	public void mouseReleased(MouseEvent event) {
//		xPressed = -1;
//		yPressed = -1;
	}
	
	@Override
	public void mouseDragged(MouseEvent movement){
		if (xPressed >= 0 && yPressed >= 0) {
			int golfballx = movement.getX();
			int golfbally = movement.getY();
			golfball.move(golfballx - xPressed, golfbally - yPressed);
			xPressed = golfballx;
			yPressed = golfbally;
			double golfx = golfball.getX();
			double golfy = golfball.getY();
			println(golfx + "," + golfy);
		}
	}
	
	public void run() {
		golfball = new GOval (100, 100, 50, 50);
		xVelocity = 0.8;
		yVelocity = 0.0;
		ball = new GOval(100, 100, 50, 50);
		add(ball);
		add(golfball);
		addMouseListeners();
		while (true) {
			ball.move(xVelocity, yVelocity);
			if (ball.getY() > 500) {
				
				double yDifference = ball.getY() - 500.00;
				ball.setLocation(ball.getX(), 500 - yDifference);
				
//				ball.setLocation(ball.getX(), 500);
				yVelocity = -yVelocity;
			}
			yVelocity += gravity;
			if (ball.getX() > 650) {
				xVelocity = -xVelocity;
			}
			if (ball.getX() < 50) {
				xVelocity = -xVelocity;
			}
			pause(pauseInterval);
		}
	}
}
