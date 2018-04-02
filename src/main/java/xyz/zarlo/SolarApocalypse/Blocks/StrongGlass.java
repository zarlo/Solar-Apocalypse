package xyz.zarlo.SolarApocalypse.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import xyz.zarlo.SolarApocalypse.Main;

public class StrongGlass extends Block  {

    public StrongGlass() {
    	
        super(Material.GLASS);
        this.setUnlocalizedName(Main.modId + ".strongglass");
        this.setRegistryName("strongglass");
        this.setHardness(2.0F);
        this.setResistance(6.0F);
        
    }

    
}
