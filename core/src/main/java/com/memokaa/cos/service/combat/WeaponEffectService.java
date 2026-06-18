package com.memokaa.cos.service.combat;

import com.memokaa.cos.enumtype.item.EquipmentSlot;
import com.memokaa.cos.enumtype.item.ItemPropertyType;
import com.memokaa.cos.gameobject.base.LivingEntity;
import com.memokaa.cos.gameobject.effect.StatusEffectTemplate;
import com.memokaa.cos.gameobject.combat.StatusEffectInstance;
import com.memokaa.cos.gameobject.item.ItemInstance;
import com.memokaa.cos.gameobject.item.ItemProperty;
import com.memokaa.cos.gameobject.item.WeaponTemplate;
import com.memokaa.cos.manager.item.ItemManager;
import com.memokaa.cos.manager.template.TemplateManager;

public class WeaponEffectService {

    private final TemplateManager templateManager;

    private final ItemManager itemManager;

    private final StatusEffectService effectService;

    public WeaponEffectService(
        TemplateManager templateManager,
        ItemManager itemManager,
        StatusEffectService effectService) {

        this.templateManager =
            templateManager;

        this.itemManager =
            itemManager;

        this.effectService =
            effectService;
    }

    /**
     * Silah üzerindeki effectleri uygular.
     */
    public void applyWeaponEffects(
        LivingEntity attacker,
        LivingEntity defender) {

        if(attacker == null ||
            defender == null) {

            return;
        }

        if(attacker.equipment == null) {

            return;
        }

        String itemId =
            attacker.equipment
                .equippedItems
                .get(EquipmentSlot.MAIN_HAND);

        if(itemId == null) {

            return;
        }

        ItemInstance item =
            itemManager.getItem(itemId);

        if(item == null) {

            return;
        }

        WeaponTemplate weapon =
            templateManager.getTemplate(
                item.itemTemplateId,
                WeaponTemplate.class);

        if(weapon == null) {

            return;
        }

        for(ItemProperty property
            : weapon.properties) {

            if(property == null) {

                continue;
            }

            if(!ItemPropertyType
                .APPLY_STATUS_EFFECT
                .name()
                .equals(property.propertyTypeId)) {

                continue;
            }

            tryApplyStatusEffect(
                defender,
                property);
        }
    }

    /**
     * Status Effect uygulamayı dener.
     */
    private void tryApplyStatusEffect(
        LivingEntity defender,
        ItemProperty property) {

        double chance =
            Math.random() * 100;

        if(chance >
            property.value) {

            return;
        }

        StatusEffectTemplate template =
            templateManager.getTemplate(
                property.referenceTemplateId,
                StatusEffectTemplate.class);

        if(template == null) {

            return;
        }

        StatusEffectInstance effect =
            new StatusEffectInstance();

        effect.effectType =
            template.effectType;

        effect.power =
            template.tickValue;

        effect.active =
            true;

        effect.startTime =
            System.currentTimeMillis();

        effect.endTime =
            effect.startTime
                + (long)template.duration;

        effect.tickInterval =
            (long)template.tickInterval;

        effect.lastTickTime =
            effect.startTime;

        effectService.addEffect(
            defender,
            effect);

        System.out.println(
            template.name
                + " applied.");
    }
}
