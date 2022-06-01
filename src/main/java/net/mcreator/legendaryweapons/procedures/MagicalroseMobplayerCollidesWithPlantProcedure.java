package net.mcreator.legendaryweapons.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.legendaryweapons.LegendaryWeaponsModElements;

import java.util.Map;

@LegendaryWeaponsModElements.ModElement.Tag
public class MagicalroseMobplayerCollidesWithPlantProcedure extends LegendaryWeaponsModElements.ModElement {
	public MagicalroseMobplayerCollidesWithPlantProcedure(LegendaryWeaponsModElements instance) {
		super(instance, 71);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MagicalroseMobplayerCollidesWithPlant!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.SWEET_BERRY_BUSH, (float) 1);
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 180, (int) 1));
	}
}
