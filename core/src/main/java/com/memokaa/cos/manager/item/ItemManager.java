package com.memokaa.cos.manager.item;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.memokaa.cos.gameobject.item.ItemInstance;

/**
 * Bütün item instancelarını tutar.
 */
public class ItemManager {

    /**
     * itemInstanceId -> item
     */
    private final Map<String, ItemInstance> items =
        new HashMap<>();

    /**
     * Item ekle.
     */
    public void addItem(
        ItemInstance item) {

        if(item == null) {
            return;
        }

        items.put(
            item.itemInstanceId,
            item);
    }

    /**
     * Item getir.
     */
    public ItemInstance getItem(
        String itemInstanceId) {

        return items.get(
            itemInstanceId);
    }

    /**
     * Item sil.
     */
    public void removeItem(
        String itemInstanceId) {

        items.remove(
            itemInstanceId);
    }

    /**
     * Var mı?
     */
    public boolean contains(
        String itemInstanceId) {

        return items.containsKey(
            itemInstanceId);
    }

    /**
     * Tüm itemlar.
     */
    public Collection<ItemInstance> getAllItems() {

        return items.values();
    }

    /**
     * Temizle.
     */
    public void clear() {

        items.clear();
    }
}
