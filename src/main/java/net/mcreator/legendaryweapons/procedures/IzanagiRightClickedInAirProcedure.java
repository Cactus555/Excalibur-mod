package net.mcreator.legendaryweapons.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.legendaryweapons.item.IzanagicapacityItem;
import net.mcreator.legendaryweapons.LegendaryWeaponsModElements;

import java.util.Random;
import java.util.Map;

@LegendaryWeaponsModElements.ModElement.Tag
public class IzanagiRightClickedInAirProcedure extends LegendaryWeaponsModElements.ModElement {
	public IzanagiRightClickedInAirProcedure(LegendaryWeaponsModElements instance) {
		super(instance, 3);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure IzanagiRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure IzanagiRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure IzanagiRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !world.getWorld().isRemote && entity instanceof LivingEntity) {
			IzanagicapacityItem.shoot(world.getWorld(), (LivingEntity) entity, new Random(), (float) 1, (float) 2, (int) 0);
		}
		if (world instanceof World && !world.getWorld().isRemote && entity instanceof LivingEntity) {
			IzanagicapacityItem.shoot(world.getWorld(), (LivingEntity) entity, new Random(), (float) 1, (float) 2, (int) 0);
		}
		if (world instanceof World && !world.getWorld().isRemote && entity instanceof LivingEntity) {
			IzanagicapacityItem.shoot(world.getWorld(), (LivingEntity) entity, new Random(), (float) 1, (float) 2, (int) 0);
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 40);
	}
}
