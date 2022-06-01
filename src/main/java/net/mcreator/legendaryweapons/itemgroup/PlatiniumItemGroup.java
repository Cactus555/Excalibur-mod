
package net.mcreator.legendaryweapons.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.legendaryweapons.item.PlatiniumswordItem;
import net.mcreator.legendaryweapons.LegendaryWeaponsModElements;

@LegendaryWeaponsModElements.ModElement.Tag
public class PlatiniumItemGroup extends LegendaryWeaponsModElements.ModElement {
	public PlatiniumItemGroup(LegendaryWeaponsModElements instance) {
		super(instance, 60);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabplatinium") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PlatiniumswordItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
