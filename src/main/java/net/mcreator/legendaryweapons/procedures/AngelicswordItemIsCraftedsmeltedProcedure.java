package net.mcreator.legendaryweapons.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;

import net.mcreator.legendaryweapons.LegendaryWeaponsModElements;

import java.util.Map;

@LegendaryWeaponsModElements.ModElement.Tag
public class AngelicswordItemIsCraftedsmeltedProcedure extends LegendaryWeaponsModElements.ModElement {
	public AngelicswordItemIsCraftedsmeltedProcedure(LegendaryWeaponsModElements instance) {
		super(instance, 25);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure AngelicswordItemIsCraftedsmelted!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).addEnchantment(Enchantments.SMITE, (int) 10);
	}
}
