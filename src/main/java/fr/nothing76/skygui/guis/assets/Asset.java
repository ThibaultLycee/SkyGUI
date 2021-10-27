package fr.nothing76.skygui.guis.assets;

import net.minecraft.util.ResourceLocation;

public class Asset {

	protected int x, y;
	protected int width, height;
	protected ResourceLocation filepath;
	
	public Asset(int x, int y, int width, int height, ResourceLocation filepath) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.filepath = filepath;
	}
	
	public void render() {
		
	}
	
}
