package net.creepcraft.factions.good;

import net.creepcraft.CreepCraft;
import net.creepcraft.factions.Faction;

public class GoodFaction extends Faction {
	public GoodFaction(CreepCraft plugin) {
		super(plugin);
	}

	@Override
	public FactionType getType() {
		return FactionType.GOOD;
	}
}
