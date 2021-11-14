package fr.nothing76.skygui.utils;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;

import java.util.HashMap;

import fr.nothing76.skygui.resources.Resources;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.common.MinecraftForge;

public class Utils {

	
	// Counts the total iotas
	private static HashMap<String, Integer> iota_counts = new HashMap<String, Integer>();
	/**
	 * Simply an index counter
	 */
	public static int iota(String section, boolean reset) {
		int iota_value = iota_counts.getOrDefault(section, -1) + 1;
		if (reset) {
			iota_counts.put(section, 0);
			iota_value = 0;
		} else {
			iota_counts.put(section, iota_value);
		}
		return iota_value;
	}
	public static int iota(String section) {
		return iota(section, false);
	}
	
	/**
	 * Send a chat message to the player
	 * @param text the text to send
	 * @param prefix whether or not to use the mod prefix before the message
	 */
	public static void sendMessage(String text, boolean prefix) {
        ClientChatReceivedEvent event = new ClientChatReceivedEvent((byte) 1, (IChatComponent) new ChatComponentText((prefix ? Resources.MESSAGE_PREFIX : "") + text));
        MinecraftForge.EVENT_BUS.post(event); // Let other mods pick up the new message
        if (!event.isCanceled()) {
            Minecraft.getMinecraft().thePlayer.addChatMessage(event.message); // Just for logs
        }
    }

	/**
	 * Send a chat message to the player
	 * @param text the text to send
	 */
    public static void sendMessage(String text) {
        sendMessage(text, true);
    }
	
    /**
     * Draw a texture with the active texture renderer
     * @param x the coord x on screen to draw
     * @param y the coord y on screen to draw
     * @param width the width of the rectangle drawn
     * @param height the height of the rectangle drawn
     * @param uMin the origin x of the texture on the image in proportion to the image
     * @param uMax the end x of the texture on the image in proportion to the image
     * @param vMin the origin y of the texture on the image in proportion to the image
     * @param vMax the end y of the texture on the image in proportion to the image
     * @param filter, just use GL11.GL_NEAREST
     */
    public static void drawTexturedRect(float x, float y, float width, float height, float uMin, float uMax, float vMin, float vMax, int filter, float alpha) {
		
    	GlStateManager.color(1, 1, 1, alpha);
    	GlStateManager.enableTexture2D();
		GlStateManager.enableBlend();
		GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, GL11.GL_ONE, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL14.glBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, GL11.GL_ONE, GL11.GL_ONE_MINUS_SRC_ALPHA);
		
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, filter);
		
		Tessellator tessellator = Tessellator.getInstance();
		WorldRenderer worldrenderer = tessellator.getWorldRenderer();
		worldrenderer.begin(7,  DefaultVertexFormats.POSITION_TEX);
		worldrenderer.pos(x, y+height, 0.0D).tex(uMin, vMax).endVertex();
		worldrenderer.pos(x+width, y+height, 0.0D).tex(uMax, vMax).endVertex();
		worldrenderer.pos(x+width, y, 0.0D).tex(uMax, vMin).endVertex();
		worldrenderer.pos(x, y, 0.0D).tex(uMin, vMin).endVertex();
		tessellator.draw();
		
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);

        GlStateManager.disableBlend();
	}
    
    public static void drawTexturedRect(float x, float y, float width, float height, float uMin, float uMax, float vMin, float vMax, int filter, float alpha, ResourceLocation filepath) {
    	Minecraft.getMinecraft().getTextureManager().bindTexture(filepath);
    	drawTexturedRect(x, y, width, height, uMin, uMax, vMin, vMax, filter, alpha);
	}
    
}
