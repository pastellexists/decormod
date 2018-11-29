package pastell.firstmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import pastell.firstmod.FirstMod;

public class ItemBase extends Item {

    protected String name;

    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(FirstMod.creativeTab);
    }

    public void registerItemModel() {
        FirstMod.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}