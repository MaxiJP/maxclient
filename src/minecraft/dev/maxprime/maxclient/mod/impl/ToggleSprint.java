package dev.maxprime.maxclient.mod.impl;

import dev.maxprime.maxclient.event.EventTarget;
import dev.maxprime.maxclient.event.impl.EventUpdate;
import dev.maxprime.maxclient.mod.Category;
import dev.maxprime.maxclient.mod.Mod;

public class ToggleSprint extends Mod {
	
	public ToggleSprint() {
		super("ToggleSprint", "Auto sprint wiht just one p0ress of CTRL!", Category.MISC);
	}
	
	@EventTarget
	public void onUpdate(EventUpdate event) {
		if (this.isEnabled() && !mc.thePlayer.isBlocking() && !mc.thePlayer.isSneaking() && !mc.thePlayer.isAirBorne) {
			mc.thePlayer.setSprinting(true);
		}
	}
	
	@Override
	public void onDisable() {
		super.onDisable();
		
		mc.thePlayer.setSprinting(false);
	}
	
}
