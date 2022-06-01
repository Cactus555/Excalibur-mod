
package net.mcreator.legendaryweapons.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.legendaryweapons.itemgroup.LegendItemGroup;
import net.mcreator.legendaryweapons.LegendaryWeaponsModElements;

@LegendaryWeaponsModElements.ModElement.Tag
public class ElixirItem extends LegendaryWeaponsModElements.ModElement {
	@ObjectHolder("legendary_weapons:elixir")
	public static final Item block = null;
	public ElixirItem(LegendaryWeaponsModElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(LegendItemGroup.tab).maxStackSize(1));
			setRegistryName("elixir");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
