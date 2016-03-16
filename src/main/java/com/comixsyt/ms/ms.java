package com.comixsyt.ms;

import com.comixsyt.ms.block.DiamondiumBlock;
import com.comixsyt.ms.block.Liquefier;
import com.comixsyt.ms.block.UltimatiumBlock;
import com.comixsyt.ms.block.UltimatiumOre;
import com.comixsyt.ms.handler.GuiHandler;
import com.comixsyt.ms.item.CHarmor;
import com.comixsyt.ms.item.Diamondiumaxe;
import com.comixsyt.ms.item.Diamondiumhoe;
import com.comixsyt.ms.item.Diamondiumpic;
import com.comixsyt.ms.item.Diamondiumshovel;
import com.comixsyt.ms.item.Diamondiumsword;
import com.comixsyt.ms.item.DirtAxe;
import com.comixsyt.ms.item.DirtHoe;
import com.comixsyt.ms.item.DirtShovel;
import com.comixsyt.ms.item.DirtSword;
import com.comixsyt.ms.item.NRaxe;
import com.comixsyt.ms.item.NRhoe;
import com.comixsyt.ms.item.NRpic;
import com.comixsyt.ms.item.NRshovel;
import com.comixsyt.ms.item.NRsword;
import com.comixsyt.ms.item.Ultimatium;
import com.comixsyt.ms.item.Ultimatiumarmor;
import com.comixsyt.ms.item.diamondiumarmor;
import com.comixsyt.ms.item.glassAxe;
import com.comixsyt.ms.item.glassHoe;
import com.comixsyt.ms.item.glassPic;
import com.comixsyt.ms.item.glassShovel;
import com.comixsyt.ms.item.glassSword;
import com.comixsyt.ms.item.hRoot;
import com.comixsyt.ms.item.itemDirtPic;
import com.comixsyt.ms.item.potAxe;
import com.comixsyt.ms.item.potHoe;
import com.comixsyt.ms.item.potPic;
import com.comixsyt.ms.item.potShovel;
import com.comixsyt.ms.item.potSword;
import com.comixsyt.ms.item.potarmor;
import com.comixsyt.ms.item.rsAxe;
import com.comixsyt.ms.item.rsHoe;
import com.comixsyt.ms.item.rsPic;
import com.comixsyt.ms.item.rsShovel;
import com.comixsyt.ms.item.rsSword;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = "ms", name = "MineMania: Rebirth", version = "1.0")
public class ms {

	@SidedProxy(clientSide = "com.comixsyt.ms.ClientProxy", serverSide = "com.comixsyt.ms.ServerProxy")
	public static ServerProxy proxy;
	

	// dirt
	public static Item itemDirtPic; // always a habit for the first to have item
									// in the name, don't know why lol.
	public static Item DirtSword;
	public static Item DirtShovel;
	public static Item DirtHoe;
	public static Item DirtAxe;

	// glass
	public static Item glassPic;
	public static Item glassSword;
	public static Item glassShovel;
	public static Item glassHoe;
	public static Item glassAxe;

	// potato
	public static Item potPic;
	public static Item potSword;
	public static Item potShovel;
	public static Item potHoe;
	public static Item potAxe;

	public static Item pothelm;
	public static Item potchest;
	public static Item potlegs;
	public static Item potboots;

	// redstone
	public static Item rsPic;
	public static Item rsSword;
	public static Item rsShovel;
	public static Item rsHoe;
	public static Item rsAxe;

	// Items
	public static Item hRoot;

	public static Item Diamondium;
	public static Item DiamondiumN;

	public static Item Ultimatium;
	public static Item Ultimatiumpic;
	public static Item Ultimatiumsword;
	public static Item Ultimatiumhoe;
	public static Item Ultimatiumshovel;
	public static Item Ultimatiumaxe;

	public static Item UltimatiumHelm;
	public static Item UltimatiumChest;
	public static Item UltimatiumLegs;
	public static Item UltimatiumBoots;
	// Ore & Blocks
	// Ore
	public static Block UltimatiumOre;

	// Blocks
	public static Block DiamondiumBlock;
	public static Block UltimatiumBlock;

	// Diamondium
	public static Item Diamondiumpic;
	public static Item Diamondiumsword;
	public static Item Diamondiumhoe;
	public static Item Diamondiumshovel;
	public static Item Diamondiumaxe;

	public static Item DiamondiumHelm;
	public static Item DiamondiumChest;
	public static Item DiamondiumLegs;
	public static Item DiamondiumBoots;

	public static Item CHHelm;
	public static Item CHChest;
	public static Item CHLegs;
	public static Item CHBoots;

	public static Item NRpic;
	public static Item NRsword;
	public static Item NRhoe;
	public static Item NRshovel;
	public static Item NRaxe;

	public static Block Liquefier;
	public static Block LiquefierActive;

	// public static Item bonePic;
	// public static Item nrPic;
	// public static Item quartzpic;
	// public static Item woolpic;

	public static final Item.ToolMaterial dirtMaterial = EnumHelper.addToolMaterial("dirtMaterial", 0, 15, 1.0F, 0.0F,
			2);
	public static final Item.ToolMaterial glassMaterial = EnumHelper.addToolMaterial("dirtMaterial", 3, 1, 5.0F, 2.5F,
			30);
	public static final Item.ToolMaterial potMaterial = EnumHelper.addToolMaterial("potMaterial", 0, 49, 1.5F, 0.0F,
			10);
	public static final ItemArmor.ArmorMaterial potMaterialA = EnumHelper.addArmorMaterial("potMaterialA", 15,
			new int[] { 1, 3, 2, 1 }, 10);
	public static final Item.ToolMaterial rsMaterial = EnumHelper.addToolMaterial("rsMaterial", 2, 399, 6.0F, 1.6F, 15);
	public static final Item.ToolMaterial DiamondiumMaterial = EnumHelper.addToolMaterial("DiamondiumMaterial", 6, 1999,
			7.5F, 4.6F, 18);
	public static final ItemArmor.ArmorMaterial DiamondiumA = EnumHelper.addArmorMaterial("DiamondiumA", 50,
			new int[] { 4, 9, 7, 4 }, 18);
	public static final ItemArmor.ArmorMaterial CHA = EnumHelper.addArmorMaterial("CHA", 20, new int[] { 3, 6, 5, 2 },
			18);
	public static final Item.ToolMaterial NRT = EnumHelper.addToolMaterial("NRT", 1, 149, 5.0F, 1.5F, 5);
	public static final ItemArmor.ArmorMaterial UltimatiumA = EnumHelper.addArmorMaterial("UltimatiumA", 40,
			new int[] { 5, 9, 5, 5 }, 18);
	public static final Item.ToolMaterial UltimatiumT = EnumHelper.addToolMaterial("UltimatiumT", 6, 4999, 14.0F, 5.5F,
			18);
	
	@Mod.Instance
	public static ms modInstance;
	

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Who the fuck thought FMLPreInitializationEvent should be one word?
		// Item & block Initialization and registering
		// Config handling if I want it latter on, most likely will no be added

		proxy.registerTileEntities();
		proxy.registerRenderThings();

				
		oreDictionary();
		
		
		// Tools & Armor
		// dirt tools
		itemDirtPic = new itemDirtPic(dirtMaterial).setUnlocalizedName("DirtPickaxe").setTextureName("ms:dirt_pic")
				.setCreativeTab(tabMST);
		DirtSword = new DirtSword(dirtMaterial).setUnlocalizedName("DirtSword").setTextureName("ms:dirt_sword")
				.setCreativeTab(tabMST);
		DirtShovel = new DirtShovel(dirtMaterial).setUnlocalizedName("DirtShovel").setTextureName("ms:dirt_shovel")
				.setCreativeTab(tabMST);
		DirtHoe = new DirtHoe(dirtMaterial).setUnlocalizedName("DirtHoe").setTextureName("ms:dirt_hoe")
				.setCreativeTab(tabMST);
		DirtAxe = new DirtAxe(dirtMaterial).setUnlocalizedName("DirtAxe").setTextureName("ms:dirt_axe")
				.setCreativeTab(tabMST);

		GameRegistry.registerItem(itemDirtPic, itemDirtPic.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(DirtSword, DirtSword.getUnlocalizedName());
		GameRegistry.registerItem(DirtShovel, DirtShovel.getUnlocalizedName());
		GameRegistry.registerItem(DirtHoe, DirtHoe.getUnlocalizedName());
		GameRegistry.registerItem(DirtAxe, DirtAxe.getUnlocalizedName());

		// glass tools
		glassPic = new glassPic(glassMaterial).setUnlocalizedName("glassPickaxe").setTextureName("ms:glass_pic")
				.setCreativeTab(tabMST);
		glassSword = new glassSword(glassMaterial).setUnlocalizedName("glassSword").setTextureName("ms:glass_sword")
				.setCreativeTab(tabMST);
		glassShovel = new glassShovel(glassMaterial).setUnlocalizedName("glassShovel").setTextureName("ms:glass_shovel")
				.setCreativeTab(tabMST);
		glassHoe = new glassHoe(glassMaterial).setUnlocalizedName("glassHoe").setTextureName("ms:glass_hoe")
				.setCreativeTab(tabMST);
		glassAxe = new glassAxe(glassMaterial).setUnlocalizedName("glassAxe").setTextureName("ms:glass_axe")
				.setCreativeTab(tabMST);

		GameRegistry.registerItem(glassPic, glassPic.getUnlocalizedName());
		GameRegistry.registerItem(glassSword, glassSword.getUnlocalizedName());
		GameRegistry.registerItem(glassShovel, glassShovel.getUnlocalizedName());
		GameRegistry.registerItem(glassHoe, glassHoe.getUnlocalizedName());
		GameRegistry.registerItem(glassAxe, glassAxe.getUnlocalizedName());

		
		// potato
		potPic = new potPic(potMaterial).setUnlocalizedName("potPickaxe").setTextureName("ms:potpic")
				.setCreativeTab(tabMST);
		potSword = new potSword(potMaterial).setUnlocalizedName("potSword").setTextureName("ms:potsword")
				.setCreativeTab(tabMST);
		potShovel = new potShovel(potMaterial).setUnlocalizedName("potShovel").setTextureName("ms:potshovel")
				.setCreativeTab(tabMST);
		potHoe = new potHoe(potMaterial).setUnlocalizedName("potHoe").setTextureName("ms:pothoe")
				.setCreativeTab(tabMST);
		potAxe = new potAxe(potMaterial).setUnlocalizedName("potAxe").setTextureName("ms:potaxe")
				.setCreativeTab(tabMST);

		GameRegistry.registerItem(potPic, potPic.getUnlocalizedName());
		GameRegistry.registerItem(potSword, potSword.getUnlocalizedName());
		GameRegistry.registerItem(potShovel, potShovel.getUnlocalizedName());
		GameRegistry.registerItem(potHoe, potHoe.getUnlocalizedName());
		GameRegistry.registerItem(potAxe, potAxe.getUnlocalizedName());

		// pothelm = new
		// pothelm(potMaterialA).setUnlocalizedName("pothelm").setTextureName("ms:pothelm").setCreativeTab(tabMSA);
		// potchest = new
		// potchest(potMaterialA).setUnlocalizedName("potchest").setTextureName("ms:potshovel").setCreativeTab(tabMSA);
		// potlegs = new
		// potlegs(potMaterialA).setUnlocalizedName("potlegs").setTextureName("ms:pothoe").setCreativeTab(tabMSA);
		// potboots = new
		// potboots(potMaterialA).setUnlocalizedName("potboots").setTextureName("ms:potaxe").setCreativeTab(tabMSA);

		pothelm = new potarmor(potMaterialA, 0, 0).setUnlocalizedName("pothelm").setTextureName("ms:pothelm")
				.setCreativeTab(tabMSA);
		potchest = new potarmor(potMaterialA, 0, 1).setUnlocalizedName("potchest").setTextureName("ms:potchest")
				.setCreativeTab(tabMSA);
		potlegs = new potarmor(potMaterialA, 0, 2).setUnlocalizedName("potlegs").setTextureName("ms:potlegs")
				.setCreativeTab(tabMSA);
		potboots = new potarmor(potMaterialA, 0, 3).setUnlocalizedName("potboots").setTextureName("ms:potboots")
				.setCreativeTab(tabMSA);

		GameRegistry.registerItem(pothelm, pothelm.getUnlocalizedName());
		GameRegistry.registerItem(potchest, potchest.getUnlocalizedName());
		GameRegistry.registerItem(potlegs, potlegs.getUnlocalizedName());
		GameRegistry.registerItem(potboots, potboots.getUnlocalizedName());

		// redstone
		rsPic = new rsPic(rsMaterial).setUnlocalizedName("rsPickaxe").setTextureName("ms:rspic").setCreativeTab(tabMST);
		rsSword = new rsSword(rsMaterial).setUnlocalizedName("rsSword").setTextureName("ms:rssword")
				.setCreativeTab(tabMST);
		rsShovel = new rsShovel(rsMaterial).setUnlocalizedName("rsShovel").setTextureName("ms:rsshovel")
				.setCreativeTab(tabMST);
		rsHoe = new rsHoe(rsMaterial).setUnlocalizedName("rsHoe").setTextureName("ms:rshoe").setCreativeTab(tabMST);
		rsAxe = new rsAxe(rsMaterial).setUnlocalizedName("rsAxe").setTextureName("ms:rsaxe").setCreativeTab(tabMST);

		GameRegistry.registerItem(rsPic, rsPic.getUnlocalizedName());
		GameRegistry.registerItem(rsSword, rsSword.getUnlocalizedName());
		GameRegistry.registerItem(rsShovel, rsShovel.getUnlocalizedName());
		GameRegistry.registerItem(rsHoe, rsHoe.getUnlocalizedName());
		GameRegistry.registerItem(rsAxe, rsAxe.getUnlocalizedName());

		// Lone Items
		hRoot = new hRoot(1, 0.5F, false).setUnlocalizedName("hRoot").setTextureName("ms:hRoot").setCreativeTab(tabMSI);
		GameRegistry.registerItem(hRoot, hRoot.getUnlocalizedName());

		Liquefier = new Liquefier(false).setBlockName("Liquefier").setCreativeTab(tabMSB);
		LiquefierActive = new Liquefier(true).setBlockName("LiquefierActive");

		GameRegistry.registerBlock(Liquefier, Liquefier.getUnlocalizedName());
		GameRegistry.registerBlock(LiquefierActive, LiquefierActive.getUnlocalizedName());

		// Diamondium

		Diamondium = new Item().setUnlocalizedName("Diamondium").setTextureName("ms:Diamondium").setCreativeTab(tabMSI);

		GameRegistry.registerItem(Diamondium, Diamondium.getUnlocalizedName());

		DiamondiumN = new Item().setUnlocalizedName("DiamondiumN").setTextureName("ms:DiamondiumN")
				.setCreativeTab(tabMSI);

		GameRegistry.registerItem(DiamondiumN, DiamondiumN.getUnlocalizedName());

		Diamondiumpic = new Diamondiumpic(DiamondiumMaterial).setUnlocalizedName("diamondiumPickaxe")
				.setTextureName("ms:diamondium_pic").setCreativeTab(tabMST);
		Diamondiumsword = new Diamondiumsword(DiamondiumMaterial).setUnlocalizedName("diamondiumSword")
				.setTextureName("ms:diamondium_sword").setCreativeTab(tabMST);
		Diamondiumshovel = new Diamondiumshovel(DiamondiumMaterial).setUnlocalizedName("diamondiumShovel")
				.setTextureName("ms:diamondium_shovel").setCreativeTab(tabMST);
		Diamondiumhoe = new Diamondiumhoe(DiamondiumMaterial).setUnlocalizedName("diamondiumHoe")
				.setTextureName("ms:diamondium_hoe").setCreativeTab(tabMST);
		Diamondiumaxe = new Diamondiumaxe(DiamondiumMaterial).setUnlocalizedName("diamondiumAxe")
				.setTextureName("ms:diamondium_axe").setCreativeTab(tabMST);

		GameRegistry.registerItem(Diamondiumpic, Diamondiumpic.getUnlocalizedName());
		GameRegistry.registerItem(Diamondiumsword, Diamondiumsword.getUnlocalizedName());
		GameRegistry.registerItem(Diamondiumshovel, Diamondiumshovel.getUnlocalizedName());
		GameRegistry.registerItem(Diamondiumhoe, Diamondiumhoe.getUnlocalizedName());
		GameRegistry.registerItem(Diamondiumaxe, Diamondiumaxe.getUnlocalizedName());

		DiamondiumHelm = new diamondiumarmor(DiamondiumA, 0, 0).setUnlocalizedName("diamondiumhelm")
				.setTextureName("ms:diamondium_helm").setCreativeTab(tabMSA);
		DiamondiumChest = new diamondiumarmor(DiamondiumA, 0, 1).setUnlocalizedName("diamondiumchest")
				.setTextureName("ms:diamondium_chest").setCreativeTab(tabMSA);
		DiamondiumLegs = new diamondiumarmor(DiamondiumA, 0, 2).setUnlocalizedName("diamondiumlegs")
				.setTextureName("ms:diamondium_legs").setCreativeTab(tabMSA);
		DiamondiumBoots = new diamondiumarmor(DiamondiumA, 0, 3).setUnlocalizedName("diamondiumboots")
				.setTextureName("ms:diamondium_boots").setCreativeTab(tabMSA);

		GameRegistry.registerItem(DiamondiumHelm, DiamondiumHelm.getUnlocalizedName());
		GameRegistry.registerItem(DiamondiumChest, DiamondiumChest.getUnlocalizedName());
		GameRegistry.registerItem(DiamondiumLegs, DiamondiumLegs.getUnlocalizedName());
		GameRegistry.registerItem(DiamondiumBoots, DiamondiumBoots.getUnlocalizedName());

		DiamondiumBlock = new DiamondiumBlock(Material.rock).setBlockName("DiamondiumBlock")
				.setBlockTextureName("ms:diamondium_block").setCreativeTab(tabMSB);
		GameRegistry.registerBlock(DiamondiumBlock, DiamondiumBlock.getUnlocalizedName());

		// Chain Leather
		CHHelm = new CHarmor(CHA, 0, 0).setUnlocalizedName("CHHelm").setTextureName("ms:CH_helm")
				.setCreativeTab(tabMSA);
		CHChest = new CHarmor(CHA, 0, 1).setUnlocalizedName("CHChest").setTextureName("ms:CH_chest")
				.setCreativeTab(tabMSA);
		CHLegs = new CHarmor(CHA, 0, 2).setUnlocalizedName("CHLegs").setTextureName("ms:CH_legs")
				.setCreativeTab(tabMSA);
		CHBoots = new CHarmor(CHA, 0, 3).setUnlocalizedName("CHBoots").setTextureName("ms:CH_boots")
				.setCreativeTab(tabMSA);

		GameRegistry.registerItem(CHHelm, CHHelm.getUnlocalizedName());
		GameRegistry.registerItem(CHChest, CHChest.getUnlocalizedName());
		GameRegistry.registerItem(CHLegs, CHLegs.getUnlocalizedName());
		GameRegistry.registerItem(CHBoots, CHBoots.getUnlocalizedName());

		// NeatherRack
		NRpic = new NRpic(NRT).setUnlocalizedName("NRpic").setTextureName("ms:NR_pic").setCreativeTab(tabMST);
		NRsword = new NRsword(NRT).setUnlocalizedName("NRsword").setTextureName("ms:NR_sword").setCreativeTab(tabMST);
		NRshovel = new NRshovel(NRT).setUnlocalizedName("NRshovel").setTextureName("ms:NR_shovel")
				.setCreativeTab(tabMST);
		NRhoe = new NRhoe(NRT).setUnlocalizedName("NRhoe").setTextureName("ms:NR_hoe").setCreativeTab(tabMST);
		NRaxe = new NRaxe(NRT).setUnlocalizedName("NRaxe").setTextureName("ms:NR_axe").setCreativeTab(tabMST);

		GameRegistry.registerItem(NRpic, NRpic.getUnlocalizedName());
		GameRegistry.registerItem(NRsword, NRsword.getUnlocalizedName());
		GameRegistry.registerItem(NRshovel, NRshovel.getUnlocalizedName());
		GameRegistry.registerItem(NRhoe, NRhoe.getUnlocalizedName());
		GameRegistry.registerItem(NRaxe, NRaxe.getUnlocalizedName());

		// Ultimatium
		Ultimatium = new Ultimatium().setUnlocalizedName("Ultimatium").setTextureName("ms:Ultimatium_gem")
				.setCreativeTab(tabMSI);

		UltimatiumOre = new UltimatiumOre(Material.rock).setBlockName("UltimatiumOre")
				.setBlockTextureName("ms:Ultimatium_ore").setCreativeTab(tabMSB);

		UltimatiumBlock = new UltimatiumBlock(Material.rock).setBlockName("UltimatiumBlock")
				.setBlockTextureName("ms:Ultimatium_block").setCreativeTab(tabMSB);

		GameRegistry.registerBlock(UltimatiumOre, UltimatiumOre.getUnlocalizedName());

		GameRegistry.registerWorldGenerator(new UOreGeneration(), 0);

		GameRegistry.registerItem(Ultimatium, Ultimatium.getUnlocalizedName());

		GameRegistry.registerBlock(UltimatiumBlock, UltimatiumBlock.getUnlocalizedName());

		UltimatiumHelm = new Ultimatiumarmor(UltimatiumA, 0, 0).setUnlocalizedName("UltimatiumHelm")
				.setTextureName("ms:Ultimatium_helm").setCreativeTab(tabMSA);
		UltimatiumChest = new Ultimatiumarmor(UltimatiumA, 0, 1).setUnlocalizedName("UltimatiumUltimatiumest")
				.setTextureName("ms:Ultimatium_Ultimatiumest").setCreativeTab(tabMSA);
		UltimatiumLegs = new Ultimatiumarmor(UltimatiumA, 0, 2).setUnlocalizedName("UltimatiumLegs")
				.setTextureName("ms:Ultimatium_legs").setCreativeTab(tabMSA);
		UltimatiumBoots = new Ultimatiumarmor(UltimatiumA, 0, 3).setUnlocalizedName("UltimatiumBoots")
				.setTextureName("ms:Ultimatium_boots").setCreativeTab(tabMSA);

		GameRegistry.registerItem(UltimatiumHelm, UltimatiumHelm.getUnlocalizedName());
		GameRegistry.registerItem(UltimatiumChest, UltimatiumChest.getUnlocalizedName());
		GameRegistry.registerItem(UltimatiumLegs, UltimatiumLegs.getUnlocalizedName());
		GameRegistry.registerItem(UltimatiumBoots, UltimatiumBoots.getUnlocalizedName());

		Ultimatiumpic = new com.comixsyt.ms.item.Ultimatiumpic(UltimatiumT).setUnlocalizedName("Ultimatiumpic")
				.setTextureName("ms:Ultimatium_pic").setCreativeTab(tabMST);
		Ultimatiumsword = new com.comixsyt.ms.item.Ultimatiumsword(UltimatiumT).setUnlocalizedName("Ultimatiumsword")
				.setTextureName("ms:Ultimatium_sword").setCreativeTab(tabMST);
		Ultimatiumshovel = new com.comixsyt.ms.item.Ultimatiumshovel(UltimatiumT).setUnlocalizedName("Ultimatiumshovel")
				.setTextureName("ms:Ultimatium_shovel").setCreativeTab(tabMST);
		Ultimatiumhoe = new com.comixsyt.ms.item.Ultimatiumhoe(UltimatiumT).setUnlocalizedName("Ultimatiumhoe")
				.setTextureName("ms:Ultimatium_hoe").setCreativeTab(tabMST);
		Ultimatiumaxe = new com.comixsyt.ms.item.Ultimatiumaxe(UltimatiumT).setUnlocalizedName("Ultimatiumaxe")
				.setTextureName("ms:Ultimatium_axe").setCreativeTab(tabMST);

		GameRegistry.registerItem(Ultimatiumpic, Ultimatiumpic.getUnlocalizedName());
		GameRegistry.registerItem(Ultimatiumsword, Ultimatiumsword.getUnlocalizedName());
		GameRegistry.registerItem(Ultimatiumshovel, Ultimatiumshovel.getUnlocalizedName());
		GameRegistry.registerItem(Ultimatiumhoe, Ultimatiumhoe.getUnlocalizedName());
		GameRegistry.registerItem(Ultimatiumaxe, Ultimatiumaxe.getUnlocalizedName());

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// proxy, Entities, GUIs, packets

      //  NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
          NetworkRegistry.INSTANCE.registerGuiHandler(ms.modInstance, new GuiHandler());
        

        
		proxy.registerNetworkStuff();

		// dirt
		GameRegistry.addRecipe(new ItemStack(itemDirtPic),
				new Object[] { "DDD", " S ", " S ", 'D', Blocks.dirt, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(DirtSword),
				new Object[] { " D ", " D ", " S ", 'D', Blocks.dirt, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(DirtShovel),
				new Object[] { " D ", " S ", " S ", 'D', Blocks.dirt, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(DirtAxe),
				new Object[] { "DD ", "DS ", " S ", 'D', Blocks.dirt, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(DirtHoe),
				new Object[] { "DD ", " S ", " S ", 'D', Blocks.dirt, 'S', Items.stick });

		// glass (was lazy and kept the crafting as "D" not "G", still is glass
		// though)
		GameRegistry.addRecipe(new ItemStack(glassPic),
				new Object[] { "DDD", " S ", " S ", 'D', Blocks.glass, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(glassSword),
				new Object[] { " D ", " D ", " S ", 'D', Blocks.glass, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(glassShovel),
				new Object[] { " D ", " S ", " S ", 'D', Blocks.glass, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(glassAxe),
				new Object[] { "DD ", "DS ", " S ", 'D', Blocks.glass, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(glassHoe),
				new Object[] { "DD ", " S ", " S ", 'D', Blocks.glass, 'S', Items.stick });

		// potato (was lazy and kept the crafting as "D" not "P", still is
		// potato though)
		GameRegistry.addRecipe(new ItemStack(potPic),
				new Object[] { "DDD", " S ", " S ", 'D', Items.potato, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(potSword),
				new Object[] { " D ", " D ", " S ", 'D', Items.potato, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(potShovel),
				new Object[] { " D ", " S ", " S ", 'D', Items.potato, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(potAxe),
				new Object[] { "DD ", "DS ", " S ", 'D', Items.potato, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(potHoe),
				new Object[] { "DD ", " S ", " S ", 'D', Items.potato, 'S', Items.stick });
		// No longer was lazy with the armor lol
		GameRegistry.addRecipe(new ItemStack(pothelm), new Object[] { "PPP", "P P", 'P', Items.potato });
		GameRegistry.addRecipe(new ItemStack(potlegs), new Object[] { "PPP", "P P", "P P", 'P', Items.potato });
		GameRegistry.addRecipe(new ItemStack(potchest), new Object[] { "P P", "PPP", "PPP", 'P', Items.potato });
		GameRegistry.addRecipe(new ItemStack(potboots), new Object[] { "P P", "P P", 'P', Items.potato });

		// redstone
		GameRegistry.addRecipe(new ItemStack(rsPic),
				new Object[] { "DDD", " S ", " S ", 'D', Items.redstone, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(rsSword),
				new Object[] { " D ", " D ", " S ", 'D', Items.redstone, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(rsShovel),
				new Object[] { " D ", " S ", " S ", 'D', Items.redstone, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(rsAxe),
				new Object[] { "DD ", "DS ", " S ", 'D', Items.redstone, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(rsHoe),
				new Object[] { "DD ", " S ", " S ", 'D', Items.redstone, 'S', Items.stick });

		// Holy Root
		GameRegistry.addRecipe(new ItemStack(hRoot, 4),
				new Object[] { "DS ", " S ", " SD", 'S', Items.stick, 'D', Diamondium });
		GameRegistry.addRecipe(new ItemStack(hRoot, 4),
				new Object[] { " SD", " S ", " SD", 'S', Items.stick, 'D', Diamondium });
		GameRegistry.addRecipe(new ItemStack(hRoot, 4),
				new Object[] { "DS ", " S ", "DS ", 'S', Items.stick, 'D', Diamondium });
		GameRegistry.addRecipe(new ItemStack(hRoot, 4),
				new Object[] { "DS ", " S ", " SD", 'S', Items.stick, 'D', Diamondium });

		// diamondium
		GameRegistry.addSmelting(Items.diamond, new ItemStack(DiamondiumN), 5.0F);
		GameRegistry.addRecipe(new ItemStack(Diamondium),
				new Object[] { " D ", "DED", " D ", 'D', DiamondiumN, 'E', Items.ender_eye });
		GameRegistry.addRecipe(new ItemStack(DiamondiumHelm), new Object[] { "PPP", "P P", 'P', Diamondium });
		GameRegistry.addRecipe(new ItemStack(DiamondiumLegs), new Object[] { "PPP", "P P", "P P", 'P', Diamondium });
		GameRegistry.addRecipe(new ItemStack(DiamondiumChest), new Object[] { "P P", "PPP", "PPP", 'P', Diamondium });
		GameRegistry.addRecipe(new ItemStack(DiamondiumBoots), new Object[] { "P P", "P P", 'P', Diamondium });
		GameRegistry.addRecipe(new ItemStack(DiamondiumBlock), new Object[] { "PPP", "PPP", "PPP", 'P', Diamondium });

		// NetherRack
		GameRegistry.addRecipe(new ItemStack(NRpic),
				new Object[] { "DDD", " S ", " S ", 'D', Blocks.netherrack, 'S', Items.blaze_rod });
		GameRegistry.addRecipe(new ItemStack(NRsword),
				new Object[] { " D ", " D ", " S ", 'D', Blocks.netherrack, 'S', Items.blaze_rod });
		GameRegistry.addRecipe(new ItemStack(NRshovel),
				new Object[] { " D ", " S ", " S ", 'D', Blocks.netherrack, 'S', Items.blaze_rod });
		GameRegistry.addRecipe(new ItemStack(NRaxe),
				new Object[] { "DD ", "DS ", " S ", 'D', Blocks.netherrack, 'S', Items.blaze_rod });
		GameRegistry.addRecipe(new ItemStack(NRhoe),
				new Object[] { "DD ", " S ", " S ", 'D', Blocks.netherrack, 'S', Items.blaze_rod });

		// ChainLeather (also Chainmail)
		GameRegistry.addRecipe(new ItemStack(CHHelm),
				new Object[] { "III", "ILI", "III", 'I', Items.iron_ingot, 'L', Items.leather_helmet });
		GameRegistry.addRecipe(new ItemStack(CHChest),
				new Object[] { "III", "ILI", "III", 'I', Items.iron_ingot, 'L', Items.leather_chestplate });
		GameRegistry.addRecipe(new ItemStack(CHLegs),
				new Object[] { "III", "ILI", "III", 'I', Items.iron_ingot, 'L', Items.leather_leggings });
		GameRegistry.addRecipe(new ItemStack(CHBoots),
				new Object[] { "III", "ILI", "III", 'I', Items.iron_ingot, 'L', Items.leather_boots });

		// Ultimatium
		GameRegistry.addRecipe(new ItemStack(UltimatiumBlock), new Object[] { "PPP", "PPP", "PPP", 'P', Ultimatium });
		GameRegistry.addRecipe(new ItemStack(Ultimatium), new Object[] { "PPP", "PPP", "PPP", 'P', Diamondium });

		GameRegistry.addShapelessRecipe(new ItemStack(Items.blaze_rod),
				new Object[] { Items.stick, new ItemStack(Items.blaze_powder) });

	}

	public static void oreDictionary() {
		OreDictionary.registerOre("gemDiamondium", Diamondium);
		OreDictionary.registerOre("ingotDiamondium", Diamondium);
		OreDictionary.registerOre("nuggetDiamond", DiamondiumN);
		OreDictionary.registerOre("oreUltimatium", UltimatiumOre);
		OreDictionary.registerOre("gemUltimatium", Ultimatium);
		OreDictionary.registerOre("ingotUltimatium", Ultimatium);

	}

	@EventHandler
	public void init(FMLPostInitializationEvent event) {

	}

	public static CreativeTabs tabMST = new CreativeTabs("tabMST") {

		@Override
		public Item getTabIconItem() {
			return new ItemStack(itemDirtPic).getItem();
		}

	};

	public static CreativeTabs tabMSA = new CreativeTabs("tabMSA") {

		@Override
		public Item getTabIconItem() {
			return new ItemStack(pothelm).getItem();
		}

	};

	public static CreativeTabs tabMSI = new CreativeTabs("tabMSI") {
		// despite being MSI, I have no connection to them at all, I prefer EVGA
		// and ASUS, lol
		@Override
		public Item getTabIconItem() {
			return new ItemStack(hRoot).getItem();
		}

	};

	public static CreativeTabs tabMSB = new CreativeTabs("tabMSB") {

		@Override
		public Item getTabIconItem() {
			return new ItemStack(UltimatiumOre).getItem();
		}

	};

}
