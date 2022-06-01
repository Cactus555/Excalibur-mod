
package net.mcreator.legendaryweapons.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.legendaryweapons.itemgroup.PlatiniumItemGroup;
import net.mcreator.legendaryweapons.LegendaryWeaponsModElements;

@LegendaryWeaponsModElements.ModElement.Tag
public class PlatiniumpickaxeItem extends LegendaryWeaponsModElements.ModElement {
	@ObjectHolder("legendary_weapons:platiniumpickaxe")
	public static final Item block = null;
	public PlatiniumpickaxeItem(LegendaryWeaponsModElements instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 6234;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PlatiniumingotItem.block, (int) (1)));
			}
		}, 1, -2.7f, new Item.Properties().group(PlatiniumItemGroup.tab)) {
		}.setRegistryName("platiniumpickaxe"));
	}
}
