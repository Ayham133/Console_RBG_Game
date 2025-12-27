package com.mycompany.classs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Inventory
 */
public class Inventory {
    private Map<UUID, Item> inventory = new LinkedHashMap<>();
    private int inventorySize;

    public int getInventorySize() {
        return inventorySize;
    }

    /**
     * addItem
     *
     * Adds Item to this inventory.
     */
    public void addItem(Item item) {
        // if the item is in the inventory, update the quantity. else add the item
        // otherwise.
        if (inventory.containsKey(item.getID())) {
            int updatedQuantity = inventory.get(item.getID()).getQuantity() + item.getQuantity();
            inventory.get(item.getID()).setQuantity(updatedQuantity);

        } else {
            inventory.put(item.getID(), item);
            inventorySize++;
        }
    }

    /**
     * removeItem
     *
     * Removes all the quantity of the item or part of it.
     * 
     * @param itemId
     * @param quantityToRemove
     * @return ture if the itme romoved or part of it, false otherwise.
     */
    public boolean removeItem(UUID itemId, int quantityToRemove) {
        if (inventory.containsKey(itemId) && inventory.get(itemId).getQuantity() > quantityToRemove) {// remove partion
                                                                                                      // of the item.
            int updatedQuantity = inventory.get(itemId).getQuantity() - quantityToRemove;
            inventory.get(itemId).setQuantity(updatedQuantity);
            return true;
        } else if (inventory.containsKey(itemId) && inventory.get(itemId).getQuantity() == quantityToRemove) {// remove
                                                                                                              // all the
                                                                                                              // item.
            inventory.remove(itemId);
            return true;

        } else
            return false;
    }

    /**
     * Returns True if the inventory contains the item, false otherwise.
     *
     * @param itemId
     */
    public boolean contains(UUID itemId) {
        return inventory.containsKey(itemId);
    }

    @Override
    public String toString() {
        return inventory.toString();
    }

}
