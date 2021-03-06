package dev.maxprime.maxclient;

import dev.maxprime.maxclient.event.EventManager;
import dev.maxprime.maxclient.event.EventTarget;
import dev.maxprime.maxclient.event.impl.ClientTick;
import dev.maxprime.maxclient.mod.ModManager;
import net.minecraft.client.Minecraft;

public class MaxClient {
	
	public String NAME = "MaxPvP Client", VERSION = "0.0.1", AUTHOR = "Maxi_JP", NAMEVER = NAME + " " + VERSION;
	public static MaxClient INSTANCE = new MaxClient();
	public Minecraft mc = Minecraft.getMinecraft();
	
	public EventManager eventManager;
	public ModManager modManager;
	
	public void startup() {
		eventManager = new EventManager();
		modManager = new ModManager();
		
		System.out.println("Starting " + NAMEVER + " by "+ AUTHOR);
		
		eventManager.register(this);

	}
	
	public void shutdown() {
		System.out.println("Shutting down " + NAMEVER);
		
		eventManager.unregister(this);
	}
	
	@EventTarget
	public void onTick(ClientTick event) {
		if (mc.gameSettings.TOGGLE_SPRINT.isPressed()) {
			modManager.toggleSprint.toggle();
		}
	}

}
