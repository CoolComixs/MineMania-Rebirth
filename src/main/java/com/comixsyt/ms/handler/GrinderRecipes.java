package com.comixsyt.ms.handler;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.comixsyt.ms.ms;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GrinderRecipes {

	private static final GrinderRecipes SMELTING_BASE = new GrinderRecipes();

	private Map smeltingList = new HashMap();
	private Map experienceList = new HashMap();

	public static GrinderRecipes smelting() {
		return SMELTING_BASE;
	}

	public GrinderRecipes() {
		// this.addRecipie(INPUT, new ItemStack(OUTPUT), XPFLOAT);
		// this.addRecipie(Item.getItemFromBlock(INPUT), new
		// ItemStack(OUTPUT),XPFLOAT);
		// Bellow was a test, disregard it.
		// this.addRecipie(ms.Diamondium, new ItemStack(Items.diamond), 0.8f);
		this.addRecipie(Items.coal, new ItemStack(ms.coalDust), 0.8F);
		this.addRecipie(Items.iron_ingot, new ItemStack(ms.ironDust), 0.8F);
		this.addRecipie(Items.gold_ingot, new ItemStack(ms.goldDust), 0.8F);
		this.addRecipie(Items.diamond, new ItemStack(ms.diamondDust), 0.8F);
		this.addRecipie(Items.emerald, new ItemStack(ms.emeraldDust), 0.8F);
		this.addRecipie(ms.Diamondium, new ItemStack(ms.diamondiumDust), 0.8F);
		this.addRecipie(ms.Ultimatium, new ItemStack(ms.ultimatiumDust), 0.8F);
		this.addRecipie(ms.Ruby, new ItemStack(ms.rubyDust), 0.8F);

		this.addRecipie(Item.getItemFromBlock(Blocks.coal_ore), new ItemStack(ms.coalDust, 2), 0.8F);
		this.addRecipie(Item.getItemFromBlock(Blocks.iron_ore), new ItemStack(ms.ironDust, 2), 0.8F);
		this.addRecipie(Item.getItemFromBlock(Blocks.gold_ore), new ItemStack(ms.goldDust, 2), 0.8F);
		this.addRecipie(Item.getItemFromBlock(Blocks.diamond_ore), new ItemStack(ms.diamondDust, 2), 0.8F);
		this.addRecipie(Item.getItemFromBlock(Blocks.emerald_ore), new ItemStack(ms.emeraldDust, 2), 0.8F);
		this.addRecipie(Item.getItemFromBlock(ms.UltimatiumOre), new ItemStack(ms.ultimatiumDust, 2), 0.8F);
		this.addRecipie(Item.getItemFromBlock(ms.RubyOre), new ItemStack(ms.rubyDust, 2), 0.8F);

		this.addRecipie(Items.beef, new ItemStack(ms.rawgroundbeef), 0.8f);
		this.addRecipie(Items.cooked_beef, new ItemStack(ms.groundbeef), 0.8f);

	}

	public void addRecipie(Item item, ItemStack itemstack, float experience) {
		this.addLists(item, itemstack, experience);
	}

	public void addLists(Item item, ItemStack itemstack, float experience) {
		this.putLists(new ItemStack(item, 1, 32767), itemstack, experience);
	}

	public void putLists(ItemStack itemstack, ItemStack itemstack2, float experience) {
		this.smeltingList.put(itemstack, itemstack2);
		this.experienceList.put(itemstack2, Float.valueOf(experience));
	}

	public ItemStack getSmeltingResult(ItemStack itemstack) {
		Iterator iterator = this.smeltingList.entrySet().iterator();
		Entry entry;

		do {
			if (!iterator.hasNext()) {
				return null;
			}
			entry = (Entry) iterator.next();
		} while (!canBeSmelted(itemstack, (ItemStack) entry.getKey()));
		return (ItemStack) entry.getValue();
	}

	private boolean canBeSmelted(ItemStack itemstack, ItemStack itemstack2) {
		return itemstack2.getItem() == itemstack.getItem()
				&& (itemstack2.getItemDamage() == 32767 || itemstack2.getItemDamage() == itemstack.getItemDamage());
	}

	public float giveExperience(ItemStack itemstack) {
		Iterator iterator = this.experienceList.entrySet().iterator();
		Entry entry;

		do {
			if (!iterator.hasNext()) {
				return 0.0f;
			}

			entry = (Entry) iterator.next();
		} while (!this.canBeSmelted(itemstack, (ItemStack) entry.getKey()));

		if (itemstack.getItem().getSmeltingExperience(itemstack) != -1) {
			return itemstack.getItem().getSmeltingExperience(itemstack);
		}

		return ((Float) entry.getValue()).floatValue();
	}

	public Map getSmeltingList() {
		return this.smeltingList;
	}
}
