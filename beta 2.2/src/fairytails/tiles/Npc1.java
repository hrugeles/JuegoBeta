/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytails.tiles;

import fairytails.hojaSprite.Assets;
import java.awt.image.BufferedImage;

/**
 *
 * @author hrugeles
 */
public class Npc1 extends Tile{
    
    public Npc1(int id) {
        super(Assets.npc1, id);
    }
    @Override
	public boolean isSolid(){
		return true;
	}
}
