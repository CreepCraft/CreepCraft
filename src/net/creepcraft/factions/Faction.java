package net.creepcraft.factions;

import net.creepcraft.CreepCraft;
import net.creepcraft.factions.evil.EvilFaction;
import net.creepcraft.factions.good.GoodFaction;

public abstract class Faction {
	public enum FactionType {
		GOOD("Good", GoodFaction.class), EVIL("Evil", EvilFaction.class);

		private String name;
		private Class<? extends Faction> factionClass;

		private FactionType(String name, Class<? extends Faction> factionClass) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public Class<? extends Faction> getFactionClass() {
			return factionClass;
		}
	}

	protected CreepCraft plugin;

	public Faction(CreepCraft plugin) {
		this.plugin = plugin;
	}

	public abstract FactionType getType();

	public CreepCraft getPlugin() {
		return plugin;
	}
}
