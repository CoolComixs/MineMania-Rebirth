package com.comixsyt.ms;

import java.util.Random;

import com.comixsyt.ms.block.BeetCrop;
import com.comixsyt.ms.block.DiamondiumBlock;
import com.comixsyt.ms.block.Grinder;
import com.comixsyt.ms.block.Liquefier;
import com.comixsyt.ms.block.RubyBlock;
import com.comixsyt.ms.block.RubyOre;
import com.comixsyt.ms.block.UltimatiumBlock;
import com.comixsyt.ms.block.UltimatiumOre;
import com.comixsyt.ms.entity.EntityLG;
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
import com.comixsyt.ms.item.Emeraldarmor;
import com.comixsyt.ms.item.Emeraldaxe;
import com.comixsyt.ms.item.Emeraldhoe;
import com.comixsyt.ms.item.Emeraldpic;
import com.comixsyt.ms.item.Emeraldshovel;
import com.comixsyt.ms.item.Emeraldsword;
import com.comixsyt.ms.item.NRaxe;
import com.comixsyt.ms.item.NRhoe;
import com.comixsyt.ms.item.NRpic;
import com.comixsyt.ms.item.NRshovel;
import com.comixsyt.ms.item.NRsword;
import com.comixsyt.ms.item.Rubyarmor;
import com.comixsyt.ms.item.Rubyaxe;
import com.comixsyt.ms.item.Rubyhoe;
import com.comixsyt.ms.item.Rubypic;
import com.comixsyt.ms.item.Rubyshovel;
import com.comixsyt.ms.item.Rubysword;
import com.comixsyt.ms.item.Ultimatium;
import com.comixsyt.ms.item.Ultimatiumarmor;
import com.comixsyt.ms.item.beetrootitem;
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
import cpw.mods.fml.common.Mod.Instance;
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
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = "ms", name = "MineMania", version = "1.1")
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
	public static Item mIron;

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

	public static Block UltimatiumOre;

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

	public static Block Grinder;
	public static Block GrinderActive;
	public static Item cBlade;
	public static Item iRod;
	public static Item Bladecombo;

	public static Item ironDust;
	public static Item goldDust;
	public static Item diamondDust;
	public static Item emeraldDust;
	public static Item diamondiumDust;
	public static Item ultimatiumDust;
	public static Item coalDust;
	public static Item rubyDust;

	public static Item Ruby;
	public static Block RubyOre;
	public static Block RubyBlock;

	public static Item Rubypic;
	public static Item Rubysword;
	public static Item Rubyhoe;
	public static Item Rubyshovel;
	public static Item Rubyaxe;

	public static Item RubyHelm;
	public static Item RubyChest;
	public static Item RubyLegs;
	public static Item RubyBoots;

	public static Item Emeraldpic;
	public static Item Emeraldsword;
	public static Item Emeraldhoe;
	public static Item Emeraldshovel;
	public static Item Emeraldaxe;

	public static Item EmeraldHelm;
	public static Item EmeraldChest;
	public static Item EmeraldLegs;
	public static Item EmeraldBoots;

	public static Block BeetCrop;
	public static Item beetrootitem;
	public static Item beetseed;
	
	public static Item Legoguy110_Dev_Egg;

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

	public static final Item.ToolMaterial RubyMaterial = EnumHelper.addToolMaterial("RubyMaterial", 3, 1651, 9.0F, 3.0F,
			10);
	public static final ItemArmor.ArmorMaterial RubyA = EnumHelper.addArmorMaterial("RubyA", 33,
			new int[] { 3, 8, 6, 3 }, 10);

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

		mIron = new Item().setUnlocalizedName("mIron").setTextureName("ms:mIron").setCreativeTab(tabMSI);
		GameRegistry.registerItem(mIron, mIron.getUnlocalizedName());

		Liquefier = new Liquefier(false).setBlockName("Liquefier").setCreativeTab(tabMSB);
		LiquefierActive = new Liquefier(true).setBlockName("LiquefierActive");

		GameRegistry.registerBlock(Liquefier, Liquefier.getUnlocalizedName());
		GameRegistry.registerBlock(LiquefierActive, LiquefierActive.getUnlocalizedName());

		Grinder = new Grinder(false).setBlockName("Grinder").setCreativeTab(tabMSB);
		GrinderActive = new Grinder(true).setBlockName("GrinderActive");
		cBlade = new Item().setUnlocalizedName("cBlade").setTextureName("ms:cBlade").setCreativeTab(tabMSI);
		iRod = new Item().setUnlocalizedName("iRod").setTextureName("ms:iRod").setCreativeTab(tabMSI);
		Bladecombo = new Item().setUnlocalizedName("Bladecombo").setTextureName("ms:Bladecombo").setCreativeTab(tabMSI);

		GameRegistry.registerBlock(Grinder, Grinder.getUnlocalizedName());
		GameRegistry.registerBlock(GrinderActive, GrinderActive.getUnlocalizedName());
		GameRegistry.registerItem(cBlade, cBlade.getUnlocalizedName());
		GameRegistry.registerItem(iRod, iRod.getUnlocalizedName());
		GameRegistry.registerItem(Bladecombo, Bladecombo.getUnlocalizedName());

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
		UltimatiumChest = new Ultimatiumarmor(UltimatiumA, 0, 1).setUnlocalizedName("UltimatiumChest")
				.setTextureName("ms:Ultimatium_chest").setCreativeTab(tabMSA);
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

		coalDust = new Item().setUnlocalizedName("coalDust").setTextureName("ms:coalDust").setCreativeTab(tabMSI);
		ironDust = new Item().setUnlocalizedName("ironDust").setTextureName("ms:ironDust").setCreativeTab(tabMSI);
		goldDust = new Item().setUnlocalizedName("goldDust").setTextureName("ms:goldDust").setCreativeTab(tabMSI);
		diamondDust = new Item().setUnlocalizedName("diamondDust").setTextureName("ms:diamondDust")
				.setCreativeTab(tabMSI);
		emeraldDust = new Item().setUnlocalizedName("emeraldDust").setTextureName("ms:emeraldDust")
				.setCreativeTab(tabMSI);
		diamondiumDust = new Item().setUnlocalizedName("diamondiumDust").setTextureName("ms:diamondiumDust")
				.setCreativeTab(tabMSI);
		ultimatiumDust = new Item().setUnlocalizedName("ultimatiumDust").setTextureName("ms:ultimatiumDust")
				.setCreativeTab(tabMSI);
		rubyDust = new Item().setUnlocalizedName("rubyDust").setTextureName("ms:rubyDust").setCreativeTab(tabMSI);

		GameRegistry.registerItem(coalDust, coalDust.getUnlocalizedName());
		GameRegistry.registerItem(ironDust, ironDust.getUnlocalizedName());
		GameRegistry.registerItem(goldDust, goldDust.getUnlocalizedName());
		GameRegistry.registerItem(diamondDust, diamondDust.getUnlocalizedName());
		GameRegistry.registerItem(emeraldDust, emeraldDust.getUnlocalizedName());
		GameRegistry.registerItem(diamondiumDust, diamondiumDust.getUnlocalizedName());
		GameRegistry.registerItem(ultimatiumDust, ultimatiumDust.getUnlocalizedName());
		GameRegistry.registerItem(rubyDust, rubyDust.getUnlocalizedName());

		Ruby = new Item().setUnlocalizedName("Ruby").setTextureName("ms:Ruby").setCreativeTab(tabMSI);
		RubyOre = new RubyOre(Material.rock).setBlockName("RubyOre").setBlockTextureName("ms:RubyOre")
				.setCreativeTab(tabMSB);
		RubyBlock = new RubyBlock(Material.rock).setBlockName("RubyBlock").setBlockTextureName("ms:RubyBlock")
				.setCreativeTab(tabMSB);

		GameRegistry.registerItem(Ruby, Ruby.getUnlocalizedName());
		GameRegistry.registerBlock(RubyOre, RubyOre.getUnlocalizedName());
		GameRegistry.registerBlock(RubyBlock, RubyBlock.getUnlocalizedName());

		Rubypic = new Rubypic(RubyMaterial).setUnlocalizedName("RubyPickaxe").setTextureName("ms:Ruby_pic")
				.setCreativeTab(tabMST);
		Rubysword = new Rubysword(RubyMaterial).setUnlocalizedName("RubySword").setTextureName("ms:Ruby_sword")
				.setCreativeTab(tabMST);
		Rubyshovel = new Rubyshovel(RubyMaterial).setUnlocalizedName("RubyShovel").setTextureName("ms:Ruby_shovel")
				.setCreativeTab(tabMST);
		Rubyhoe = new Rubyhoe(RubyMaterial).setUnlocalizedName("RubyHoe").setTextureName("ms:Ruby_hoe")
				.setCreativeTab(tabMST);
		Rubyaxe = new Rubyaxe(RubyMaterial).setUnlocalizedName("RubyAxe").setTextureName("ms:Ruby_axe")
				.setCreativeTab(tabMST);

		GameRegistry.registerItem(Rubypic, Rubypic.getUnlocalizedName());
		GameRegistry.registerItem(Rubysword, Rubysword.getUnlocalizedName());
		GameRegistry.registerItem(Rubyshovel, Rubyshovel.getUnlocalizedName());
		GameRegistry.registerItem(Rubyhoe, Rubyhoe.getUnlocalizedName());
		GameRegistry.registerItem(Rubyaxe, Rubyaxe.getUnlocalizedName());

		RubyHelm = new Rubyarmor(RubyA, 0, 0).setUnlocalizedName("Rubyhelm").setTextureName("ms:Ruby_helm")
				.setCreativeTab(tabMSA);
		RubyChest = new Rubyarmor(RubyA, 0, 1).setUnlocalizedName("Rubychest").setTextureName("ms:Ruby_chest")
				.setCreativeTab(tabMSA);
		RubyLegs = new Rubyarmor(RubyA, 0, 2).setUnlocalizedName("Rubylegs").setTextureName("ms:Ruby_legs")
				.setCreativeTab(tabMSA);
		RubyBoots = new Rubyarmor(RubyA, 0, 3).setUnlocalizedName("Rubyboots").setTextureName("ms:Ruby_boots")
				.setCreativeTab(tabMSA);

		GameRegistry.registerItem(RubyHelm, RubyHelm.getUnlocalizedName());
		GameRegistry.registerItem(RubyChest, RubyChest.getUnlocalizedName());
		GameRegistry.registerItem(RubyLegs, RubyLegs.getUnlocalizedName());
		GameRegistry.registerItem(RubyBoots, RubyBoots.getUnlocalizedName());

		Emeraldpic = new Emeraldpic(RubyMaterial).setUnlocalizedName("EmeraldPickaxe").setTextureName("ms:EmeraldPic")
				.setCreativeTab(tabMST);
		Emeraldsword = new Emeraldsword(RubyMaterial).setUnlocalizedName("EmeraldSword")
				.setTextureName("ms:EmeraldSword").setCreativeTab(tabMST);
		Emeraldshovel = new Emeraldshovel(RubyMaterial).setUnlocalizedName("EmeraldShovel")
				.setTextureName("ms:EmeraldShovel").setCreativeTab(tabMST);
		Emeraldhoe = new Emeraldhoe(RubyMaterial).setUnlocalizedName("EmeraldHoe").setTextureName("ms:EmeraldHoe")
				.setCreativeTab(tabMST);
		Emeraldaxe = new Emeraldaxe(RubyMaterial).setUnlocalizedName("EmeraldAxe").setTextureName("ms:EmeraldAxe")
				.setCreativeTab(tabMST);

		GameRegistry.registerItem(Emeraldpic, Emeraldpic.getUnlocalizedName());
		GameRegistry.registerItem(Emeraldsword, Emeraldsword.getUnlocalizedName());
		GameRegistry.registerItem(Emeraldshovel, Emeraldshovel.getUnlocalizedName());
		GameRegistry.registerItem(Emeraldhoe, Emeraldhoe.getUnlocalizedName());
		GameRegistry.registerItem(Emeraldaxe, Emeraldaxe.getUnlocalizedName());

		EmeraldHelm = new Emeraldarmor(RubyA, 0, 0).setUnlocalizedName("Emeraldhelm").setTextureName("ms:EmeraldHelm")
				.setCreativeTab(tabMSA);
		EmeraldChest = new Emeraldarmor(RubyA, 0, 1).setUnlocalizedName("Emeraldchest")
				.setTextureName("ms:EmeraldChest").setCreativeTab(tabMSA);
		EmeraldLegs = new Emeraldarmor(RubyA, 0, 2).setUnlocalizedName("Emeraldlegs").setTextureName("ms:EmeraldLegs")
				.setCreativeTab(tabMSA);
		EmeraldBoots = new Emeraldarmor(RubyA, 0, 3).setUnlocalizedName("Emeraldboots")
				.setTextureName("ms:EmeraldBoots").setCreativeTab(tabMSA);

		GameRegistry.registerItem(EmeraldHelm, EmeraldHelm.getUnlocalizedName());
		GameRegistry.registerItem(EmeraldChest, EmeraldChest.getUnlocalizedName());
		GameRegistry.registerItem(EmeraldLegs, EmeraldLegs.getUnlocalizedName());
		GameRegistry.registerItem(EmeraldBoots, EmeraldBoots.getUnlocalizedName());

		BeetCrop = new BeetCrop().setBlockName("BeetCrop").setBlockTextureName("ms:beet");
		beetseed = new ItemSeeds(BeetCrop, Blocks.farmland).setCreativeTab(tabMSI).setUnlocalizedName("beetseed")
				.setTextureName("ms:beetseed");
		beetrootitem = new beetrootitem(1, 1.2F, false).setUnlocalizedName("beetrootitem").setTextureName("ms:beetroot").setCreativeTab(tabMSI);

		GameRegistry.registerItem(beetseed, beetseed.getUnlocalizedName());
		GameRegistry.registerItem(beetrootitem, beetrootitem.getUnlocalizedName());
		GameRegistry.registerBlock(BeetCrop, BeetCrop.getUnlocalizedName());
		
		
		
		
		
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// proxy, Entities, GUIs, packets

		NetworkRegistry.INSTANCE.registerGuiHandler(ms.modInstance, new GuiHandler());

		proxy.registerNetworkStuff();
	
		
		GameRegistry.addRecipe(new ItemStack(Liquefier),
				new Object[] { "III", "IBI", "III", 'I', Items.iron_ingot, 'B', Items.bucket });

		GameRegistry.addShapelessRecipe(new ItemStack(iRod), new Object[] { mIron, new ItemStack(Items.stick) });
		GameRegistry.addRecipe(new ItemStack(cBlade), new Object[] { " I ", "I I", " I ", 'I', Items.iron_ingot });
		GameRegistry.addShapelessRecipe(new ItemStack(Bladecombo),
				new Object[] { cBlade, new ItemStack(cBlade), new ItemStack(iRod) });
		GameRegistry.addRecipe(new ItemStack(Grinder),
				new Object[] { "III", "IBI", "III", 'I', Items.iron_ingot, 'B', Bladecombo });

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
		GameRegistry.addShapelessRecipe(new ItemStack(Diamondium, 9), new Object[] { DiamondiumBlock });

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

		// ChainLeather
		GameRegistry.addShapelessRecipe(new ItemStack(CHHelm),
				new Object[] { Items.leather_helmet, new ItemStack(mIron), new ItemStack(mIron) });
		GameRegistry.addShapelessRecipe(new ItemStack(CHChest),
				new Object[] { Items.leather_chestplate, new ItemStack(mIron), new ItemStack(mIron) });
		GameRegistry.addShapelessRecipe(new ItemStack(CHLegs),
				new Object[] { Items.leather_leggings, new ItemStack(mIron), new ItemStack(mIron) });
		GameRegistry.addShapelessRecipe(new ItemStack(CHBoots),
				new Object[] { Items.leather_boots, new ItemStack(mIron), new ItemStack(mIron) });

		// Ultimatium
		GameRegistry.addRecipe(new ItemStack(UltimatiumBlock), new Object[] { "PPP", "PPP", "PPP", 'P', Ultimatium });
		GameRegistry.addShapelessRecipe(new ItemStack(Ultimatium, 9), new Object[] { UltimatiumBlock });
		GameRegistry.addRecipe(new ItemStack(Ultimatium), new Object[] { "PPP", "PPP", "PPP", 'P', Diamondium });

		GameRegistry.addShapelessRecipe(new ItemStack(Items.blaze_rod),
				new Object[] { Items.stick, new ItemStack(Items.blaze_powder) });

		// From Mo' Recipies mod (old mod I made)

		GameRegistry.addRecipe(new ItemStack(Blocks.grass),
				new Object[] { " DS", " SS", 'D', Blocks.dirt, 'S', Items.wheat_seeds });
		GameRegistry.addRecipe(new ItemStack(Items.experience_bottle, 4),
				new Object[] { "BBB", "BDB", "BBB", 'B', Blocks.bookshelf, 'D', Items.diamond });
		GameRegistry.addRecipe(new ItemStack(Items.saddle),
				new Object[] { "LLL", "LIL", "S S", 'L', Items.leather, 'I', Items.iron_ingot, 'S', Items.lead });
		GameRegistry.addRecipe(new ItemStack(Items.saddle),
				new Object[] { "LLL", "LIL", "S S", 'L', Items.leather, 'I', Items.iron_ingot, 'S', Items.string });
		GameRegistry.addRecipe(new ItemStack(Blocks.sponge), new Object[] { "WFW", "FWF", "WBW", 'W', Blocks.wool, 'F',
				Blocks.yellow_flower, 'B', Items.water_bucket });
		GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor),
				new Object[] { "III", "III", "I I", 'I', Items.iron_ingot });
		GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor),
				new Object[] { "III", "III", "I I", 'I', Items.gold_ingot });
		GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor),
				new Object[] { "III", "III", "I I", 'I', Items.diamond });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.name_tag),
				new Object[] { Items.paper, new ItemStack(Items.string), new ItemStack(Items.iron_ingot) });
		GameRegistry.addRecipe(new ItemStack(Blocks.web, 5), new Object[] { "III", "III", "III", 'I', Items.string });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 4), new Object[] { Blocks.quartz_block });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.mossy_cobblestone),
				new Object[] { Blocks.cobblestone, new ItemStack(Blocks.vine) });
		GameRegistry.addRecipe(new ItemStack(Blocks.packed_ice), new Object[] { "III", "III", "III", 'I', Blocks.ice });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.ice, 9), new Object[] { Blocks.packed_ice });

		GameRegistry.addSmelting(coalDust, new ItemStack(Items.coal), 0.8F);
		GameRegistry.addSmelting(ironDust, new ItemStack(Items.iron_ingot), 0.8F);
		GameRegistry.addSmelting(goldDust, new ItemStack(Items.gold_ingot), 0.8F);
		GameRegistry.addSmelting(diamondDust, new ItemStack(Items.diamond), 0.8F);
		GameRegistry.addSmelting(diamondiumDust, new ItemStack(Diamondium), 0.8F);
		GameRegistry.addSmelting(ultimatiumDust, new ItemStack(Ultimatium), 0.8F);
		GameRegistry.addSmelting(rubyDust, new ItemStack(Ruby), 0.8F);

		GameRegistry.addRecipe(new ItemStack(RubyBlock), new Object[] { "PPP", "PPP", "PPP", 'P', Ruby });
		GameRegistry.addShapelessRecipe(new ItemStack(Ruby, 9), new Object[] { RubyBlock });

		GameRegistry.addRecipe(new ItemStack(Rubypic),
				new Object[] { "DDD", " S ", " S ", 'D', Ruby, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(Rubysword),
				new Object[] { " D ", " D ", " S ", 'D', Ruby, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(Rubyshovel),
				new Object[] { " D ", " S ", " S ", 'D', Ruby, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(Rubyaxe),
				new Object[] { "DD ", "DS ", " S ", 'D', Ruby, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(Rubyhoe),
				new Object[] { "DD ", " S ", " S ", 'D', Ruby, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(RubyHelm), new Object[] { "PPP", "P P", 'P', Ruby });
		GameRegistry.addRecipe(new ItemStack(RubyLegs), new Object[] { "PPP", "P P", "P P", 'P', Ruby });
		GameRegistry.addRecipe(new ItemStack(RubyChest), new Object[] { "P P", "PPP", "PPP", 'P', Ruby });
		GameRegistry.addRecipe(new ItemStack(RubyBoots), new Object[] { "P P", "P P", 'P', Ruby });

		GameRegistry.addRecipe(new ItemStack(Emeraldpic),
				new Object[] { "DDD", " S ", " S ", 'D', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(Emeraldsword),
				new Object[] { " D ", " D ", " S ", 'D', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(Emeraldshovel),
				new Object[] { " D ", " S ", " S ", 'D', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(Emeraldaxe),
				new Object[] { "DD ", "DS ", " S ", 'D', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(Emeraldhoe),
				new Object[] { "DD ", " S ", " S ", 'D', Items.emerald, 'S', Items.stick });
		// No longer was lazy with the armor lol
		GameRegistry.addRecipe(new ItemStack(EmeraldHelm), new Object[] { "PPP", "P P", 'P', Items.emerald });
		GameRegistry.addRecipe(new ItemStack(EmeraldLegs), new Object[] { "PPP", "P P", "P P", 'P', Items.emerald });
		GameRegistry.addRecipe(new ItemStack(EmeraldChest), new Object[] { "P P", "PPP", "PPP", 'P', Items.emerald });
		GameRegistry.addRecipe(new ItemStack(EmeraldBoots), new Object[] { "P P", "P P", 'P', Items.emerald });

		GameRegistry.addShapelessRecipe(new ItemStack(beetseed), new Object[] { Items.wheat_seeds, new ItemStack(Blocks.red_flower) });
		
		// Add new loot (Params: Itemstack(theItem), min, max, rarity)
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(beetseed),2,6,20));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(beetseed),2,10,50));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(beetseed),2,10,6));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(beetseed),2,5,8));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(beetseed),4,19,6));
		
	}

	
	
	public static void oreDictionary() {
		OreDictionary.registerOre("gemDiamondium", new ItemStack(Diamondium));
		OreDictionary.registerOre("ingotDiamondium", new ItemStack(Diamondium));
		OreDictionary.registerOre("nuggetDiamond", new ItemStack(DiamondiumN));
		OreDictionary.registerOre("oreUltimatium", new ItemStack(UltimatiumOre));
		OreDictionary.registerOre("gemUltimatium", new ItemStack(Ultimatium));
		OreDictionary.registerOre("ingotUltimatium", new ItemStack(Ultimatium));
		OreDictionary.registerOre("ingotIron", new ItemStack(mIron));
		OreDictionary.registerOre("dustIron", new ItemStack(ironDust));
		OreDictionary.registerOre("dustGold", new ItemStack(goldDust));
		OreDictionary.registerOre("dustDiamond", new ItemStack(diamondDust));
		OreDictionary.registerOre("dustEmerald", new ItemStack(emeraldDust));
		OreDictionary.registerOre("dustUltimatium", new ItemStack(ultimatiumDust));
		OreDictionary.registerOre("dustDiamondium", new ItemStack(diamondiumDust));
		OreDictionary.registerOre("dustRuby", new ItemStack(rubyDust));
		OreDictionary.registerOre("gemRuby", new ItemStack(Ruby));
		OreDictionary.registerOre("oreRuby", new ItemStack(RubyOre));

	} 

	@EventHandler
	public void PreLoad(FMLPreInitializationEvent PreEvent){
		EntityLG.mainRegisrty();
		
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
