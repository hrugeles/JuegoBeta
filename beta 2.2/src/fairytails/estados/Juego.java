
package fairytails.estados;

import java.awt.Graphics;

import Fairytails.Handler;
import fairytails.entidades.criaturas.Jugador;
import fairytails.mundos.World;

public class Juego extends Estados {
	
	private Jugador player;
	private World world;
	
	public Juego(Handler handler){
		super(handler);
		world = new World(handler, "res/worlds/world1.txt");
		handler.setWorld(world);
		player = new Jugador(handler, 200, 200);
	}
	
	@Override
	public void tick() {
		world.tick();
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		player.render(g);
	}

}
