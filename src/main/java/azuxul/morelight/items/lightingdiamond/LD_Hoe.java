package azuxul.morelight.items.lightingdiamond;

import azuxul.morelight.Material;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class LD_Hoe extends ItemHoe {

	public LD_Hoe() {
		
		super(Material.lightingDiamond);
		this.setUnlocalizedName("lightingdiamondhoe");
	}
	
	public EnumRarity getRarity(ItemStack stack){
		
		return EnumRarity.RARE;
	}

}