
package net.mcreator.legendaryweapons.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.legendaryweapons.itemgroup.PlatiniumItemGroup;
import net.mcreator.legendaryweapons.LegendaryWeaponsModElements;

@LegendaryWeaponsModElements.ModElement.Tag
public class PlatiniumaxeItem extends LegendaryWeaponsModElements.ModElement {
	@ObjectHolder("legendary_weapons:platiniumaxe")
	public static final Item block = null;
	public PlatiniumaxeItem(LegendaryWeaponsModElements instance) {
		super(instance, 45);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 6234;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PlatiniumingotItem.block, (int) (1)));
			}
		}, 1, -3.2999999999999999f, new Item.Properties().group(PlatiniumItemGroup.tab)) {
		}.setRegistryName("platiniumaxe"));
	}
}
