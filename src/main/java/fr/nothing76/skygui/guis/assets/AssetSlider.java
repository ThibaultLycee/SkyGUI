package fr.nothing76.skygui.guis.assets;

import org.lwjgl.opengl.GL11;

import fr.nothing76.skygui.resources.TexturesPath;
import fr.nothing76.skygui.utils.Utils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class AssetSlider extends Asset {

	private boolean value;
	
	public AssetSlider(int x, int y, int width, int height, boolean value) {
		super(x, y, width, height, TexturesPath.ASSET_SLIDER);
		this.value = value;
	}

	public AssetSlider(int x, int y, int width, int height) {
		this(x, y, width, height, false);
	}
	
	@Override
	public void render() {
		GuiScreen screen = Minecraft.getMinecraft().currentScreen;
		
		if (screen != null) {
			System.out.println("test 2");
			Minecraft.getMinecraft().getTextureManager().bindTexture(this.filepath);
			if (this.value) {
				Utils.drawTexturedRect(this.x, this.y, this.width, this.height, 0/64f, 64/64f, 32/64f, 64/64f, GL11.GL_NEAREST);
			} else {
				Utils.drawTexturedRect(this.x, this.y, this.width, this.height, 0/64f, 64/64f, 0/64f, 32/64f, GL11.GL_NEAREST);
			}
		} else {System.out.println("test 3");}
	}
	
	
}
