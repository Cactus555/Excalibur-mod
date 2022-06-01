package net.mcreator.legendaryweapons.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.legendaryweapons.LegendaryWeaponsModElements;

import java.util.Map;

@LegendaryWeaponsModElements.ModElement.Tag
public class KnightEntityIsHurtProcedure extends LegendaryWeaponsModElements.ModElement {
	public KnightEntityIsHurtProcedure(LegendaryWeaponsModElements instance) {
		super(instance, 65);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure KnightEntityIsHurt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) == 5)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, (int) 1, (int) 1));
		}
	}
}
