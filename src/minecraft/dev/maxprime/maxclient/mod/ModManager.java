package dev.maxprime.maxclient.mod;

import java.util.ArrayList;
import dev.maxprime.maxclient.mod.impl.*;

public class ModManager {

	public ToggleSprint toggleSprint;
	
	public ArrayList<Mod> mods;
	
	public ModManager() {
		mods = new ArrayList<>();
		
		// Misc
		mods.add(toggleSprint = new ToggleSprint());
	}

}