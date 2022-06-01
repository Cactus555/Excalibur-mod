package net.mcreator.legendaryweapons.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.legendaryweapons.LegendaryWeaponsModElements;

import java.util.Map;

@LegendaryWeaponsModElements.ModElement.Tag
public class ExcaliburofattackLivingEntityIsHitWithToolProcedure extends LegendaryWeaponsModElements.ModElement {
	public ExcaliburofattackLivingEntityIsHitWithToolProcedure(LegendaryWeaponsModElements instance) {
		super(instance, 30);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ExcaliburofattackLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure ExcaliburofattackLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).addEnchantment(Enchantments.SHARPNESS, (int) 1);
		if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.SHARPNESS, (itemstack))) >= 50)) {
			((itemstack)).addEnchantment(Enchantments.SHARPNESS, (int) (-50));
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 100);
		}
	}
}
