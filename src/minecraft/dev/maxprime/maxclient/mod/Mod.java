package dev.maxprime.maxclient.mod;

import dev.maxprime.maxclient.MaxClient;
import net.minecraft.client.Minecraft;

public class Mod {
	
	public Minecraft mc = Minecraft.getMinecraft();
	
	public String name, description;
	public boolean enabled;
	public Category category;
	
	public Mod(String name, String description, Category category) {
		
		this.name = name;
		this.description = description;
		this.category = category;
		
		this.enabled = true;
		
	}
	
	public void onEnable() {
		MaxClient.INSTANCE.eventManager.register(this);

	}
	
	public void onDisable() {
		MaxClient.INSTANCE.eventManager.register(this);

	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
		if (enabled) {
			onEnable();
		} else {
			onDisable();
		}
	}
	
	public void toggle() {
		setEnabled(!this.enabled);
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public Category getCategory() {
		return category;
	}

}
