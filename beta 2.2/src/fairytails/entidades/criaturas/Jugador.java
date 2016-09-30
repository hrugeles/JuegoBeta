package fairytails.entidades.criaturas;

import java.awt.Color;
import java.awt.Graphics;

import Fairytails.Handler;
import fairytails.estados.Pelea;
import fairytails.hojaSprite.Assets;
import java.util.Random;

public class Jugador extends Creature {
	
	public Jugador(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		bounds.x = 0;
		bounds.y = 0;
		bounds.width = 64;
		bounds.height = 64;
	}

	@Override
	public void tick() {
		getInput();
		move();
		handler.getGameCamera().centerOnEntity(this);
	}
	
	private void getInput(){
		xMove = 0;
		yMove = 0;
               
		
		if(handler.getKeyManager().up)
			yMove = -speed;
		if(handler.getKeyManager().down)
			yMove = speed;
		if(handler.getKeyManager().left)
			xMove = -speed;
		if(handler.getKeyManager().right)
			xMove = speed;
                if(handler.getKeyManager().fight)
                        Monstruo();
              
                
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.player, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		
//		g.setColor(Color.red);
//		g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
//				(int) (y + bounds.y - handler.getGameCamera().getyOffset()),
//				bounds.width, bounds.height);
	}
        
        public void Monstruo(){
           double d;
            double randNumber = Math.random();
            d = randNumber * 100;
            int randomInt = (int)d;
            System.out.println(randomInt);
            
            if(randomInt>95){
                Pelea f = new Pelea();
                f.setVisible (true);
                
            }
        }

}