
package Fairytails;

import fairytails.hojaSprite.GameCamera;
import fairytails.input.KeyManager;
import fairytails.mundos.World;

public class Handler {
	
	private Juego game;
	private World world;
	
	public Handler(Juego game){
		this.game = game;
	}
	
	public GameCamera getGameCamera(){
		return game.getGameCamera();
	}
	
	public KeyManager getKeyManager(){
		return game.getKeyManager();
	}
	
	public int getWidth(){
		return game.getWidth();
	}
	
	public int getHeight(){
		return game.getHeight();
	}

	public Juego getGame() {
		return game;
	}

	public void setGame(Juego game) {
		this.game = game;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

}