package net.creepcraft.factions.evil;

import net.creepcraft.CreepCraft;
import net.creepcraft.factions.Faction;

public class EvilFaction extends Faction {
	public EvilFaction(CreepCraft plugin) {
		super(plugin);
	}

	@Override
	public FactionType getType() {
		return FactionType.EVIL;
	}
}
