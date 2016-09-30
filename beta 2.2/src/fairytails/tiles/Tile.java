package fairytails.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	
	//STATIC STUFF HERE
	
	public static Tile[] tiles = new Tile[256];
	public static Tile pasto = new GrassTile(0);
	public static Tile dirtTile = new DirtTile(1);
	public static Tile rock = new Piedra(2);
        public static Tile arbol11 = new Arbol11(11);
         public static Tile arbol12 = new Arbol12(12);
          public static Tile arbol21 = new Arbol21(21);
           public static Tile arbo221 = new Arbol22(22);
            public static Tile arbo311 = new Arbol31(31);
             public static Tile arbol32 = new Arbol32(32);
	
	//CLASS
	
	public static final int TILEWIDTH = 64, TILEHEIGHT = 64;
	
	protected BufferedImage texture;
	protected final int id;
	
	public Tile(BufferedImage texture, int id){
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
	}
	
	public boolean isSolid(){
		return false;
	}
	
	public int getId(){
		return id;
	}
	
}