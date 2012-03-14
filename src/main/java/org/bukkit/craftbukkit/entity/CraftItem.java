package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityItem;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.craftbukkit.CraftServer;

public class CraftItem extends CraftEntity implements Item {
    private EntityItem item;

    public CraftItem(CraftServer server, EntityItem entity) {
        super(server, entity);
        this.item = entity;
    }

    public ItemStack getItemStack() {
        return CraftItemStack.fromNMSItemStack(item.itemStack);
    }

    public void setItemStack(ItemStack stack) {
        item.itemStack = CraftItemStack.createNMSItemStack(stack);
    }

    public int getPickupDelay() {
        return item.pickupDelay;
    }

    public void setPickupDelay(int delay) {
        item.pickupDelay = delay;
    }

    @Override
    public EntityItem getHandle() {
        return (EntityItem) entity;
    }

    @Override
    public String toString() {
        return "CraftItem";
    }

    public EntityType getType() {
        return EntityType.DROPPED_ITEM;
    }
}
