
package net.mcreator.legendaryweapons.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.legendaryweapons.itemgroup.PlatiniumItemGroup;
import net.mcreator.legendaryweapons.LegendaryWeaponsModElements;

@LegendaryWeaponsModElements.ModElement.Tag
public class PlatiniumbroadswordItem extends LegendaryWeaponsModElements.ModElement {
	@ObjectHolder("legendary_weapons:platiniumbroadsword")
	public static final Item block = null;
	public PlatiniumbroadswordItem(LegendaryWeaponsModElements instance) {
		super(instance, 59);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 6234;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PlatiniumingotItem.block, (int) (1)));
			}
		}, 3, -3.2f, new Item.Properties().group(PlatiniumItemGroup.tab)) {
		}.setRegistryName("platiniumbroadsword"));
	}
}
