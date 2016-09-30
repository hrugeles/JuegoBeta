package fairytails.estados;

import java.awt.Graphics;

import Fairytails.Handler;


public abstract class Estados {

	private static Estados currentState = null;
	
	public static void setState(Estados state){
		currentState = state;
	}
	
	public static Estados getState(){
		return currentState;
	}
	
	//CLASS
	
	protected Handler handler;
	
	public Estados(Handler handler){
		this.handler = handler;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
}