package fairytails.hojaSprite;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 32, height = 32;
	
	public static BufferedImage player, dirt, grass, stone,piedra, tree,arbol11,arbol12,arbol21,arbol22,arbol31,arbol32,avisos,agua,npc1,npc2,npc3;

	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
                SpriteSheet heroes = new SpriteSheet(ImageLoader.loadImage("/textures/heroes.png"));
                SpriteSheet temp = new SpriteSheet(ImageLoader.loadImage("/textures/tilescuadro.png"));
                SpriteSheet pasto = new SpriteSheet(ImageLoader.loadImage("/textures/pasto.png"));
                        
		
		player = heroes.crop(0, 0, width, height);
                piedra=temp.crop(width*2, height*5, width, height);
		arbol11=temp.crop(width*3,height*3,width,height);    
                arbol12=temp.crop(width*4,height*3,width,height);
                arbol21=temp.crop(width*3,height*4,width,height);
                arbol22=temp.crop(width*4,height*4,width,height);
                arbol31=temp.crop(width*3,height*5,width,height);
                arbol32=temp.crop(width*4,height*5,width,height);
                avisos=temp.crop(width*7,0,width,height);
		dirt = sheet.crop(width, 0, width, height);
                agua=sheet.crop(width*3, height, width, height);
                npc1=heroes.crop(width*3,0,width,height);
                npc2=heroes.crop(width*6,0,width,height);
                npc3=heroes.crop(width*9,0,width,height);
		grass = pasto.crop(0, 0, width, height);
		stone = sheet.crop(width * 3, 0, width, height);
		tree = sheet.crop(0, 0, width, height);
	}
	
}