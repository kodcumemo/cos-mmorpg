package com.memokaa.cos.service.combat;

import java.util.Iterator;

import com.memokaa.cos.gameobject.combat.DamageInstance;
import com.memokaa.cos.gameobject.combat.StatusEffectInstance;
import com.memokaa.cos.gameobject.base.LivingEntity;

/**
 * Status effect işlemleri.
 */
public class StatusEffectService {

    /**
     * Effect var mı?
     */
    public boolean hasEffect(
        String effectId)
    {
        effectId = "Effect varmı?";
        return false;
    }
    /**
     * Effect ekler.
     */
    public void addEffect(
        LivingEntity target,
        StatusEffectInstance effect) {

        target.activeEffects.add(effect);
    }
    /**
     * Effect kaldırır.
     */
    public void removeEffect(
        LivingEntity target,
        StatusEffectInstance effect) {

        target.activeEffects.remove(effect);
    }
    /**
     * Aktif effectleri işler.
     */
    public void updateEffects(
        LivingEntity entity,
        long currentTime) {

        Iterator<StatusEffectInstance> iterator =
            entity.activeEffects.iterator();

        while(iterator.hasNext()) {

            StatusEffectInstance effect =
                iterator.next();

            if(!effect.active) {

                iterator.remove();
                continue;
            }

            if(currentTime >= effect.endTime) {

                effect.active = false;

                iterator.remove();

                continue;
            }

            if(currentTime - effect.lastTickTime
                >= effect.tickInterval) {

                processEffectTick(
                    entity,
                    effect);

                effect.lastTickTime =
                    currentTime;
            }
        }
    }
    private void processEffectTick(
        LivingEntity target,
        StatusEffectInstance effect) {

    }
    public void tryApplyEffects(
        LivingEntity attacker,
        LivingEntity defender,
        DamageInstance damage) {

    }
}
