package com.memokaa.cos.service.combat;

import java.util.Iterator;

import com.memokaa.cos.gameobject.base.LivingEntity;
import com.memokaa.cos.gameobject.combat.DamageInstance;
import com.memokaa.cos.gameobject.combat.StatusEffectInstance;

/**
 * Status effect işlemleri.
 */
public class StatusEffectService {

    /**
     * Entity üzerinde belirtilen effect var mı?
     */
    public boolean hasEffect(
        LivingEntity target,
        String effectId) {

        for(StatusEffectInstance effect
            : target.activeEffects) {

            if(effect.effectTemplateId != null
                && effect.effectTemplateId.equals(effectId)
                && effect.active) {

                return true;
            }
        }

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

        removeEffectFlags(
            target,
            effect);

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

                removeEffectFlags(
                    entity,
                    effect);

                iterator.remove();

                continue;
            }

            if(currentTime >= effect.endTime) {

                removeEffectFlags(
                    entity,
                    effect);

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

    /**
     * Tick zamanı geldiğinde çalışır.
     */
    private void processEffectTick(
        LivingEntity target,
        StatusEffectInstance effect) {

        switch(effect.effectType) {

            case BLEED:

                target.health -=
                    effect.power;

                break;

            case POISON:

                target.health -=
                    effect.power;

                break;

            case BURN:

                target.health -=
                    effect.power;

                break;

            case FREEZE:

                target.frozen = true;

                break;

            case SLOW:

                target.slowed = true;

                break;

            case STUN:

                target.stunned = true;

                break;

            case SILENCE:

                target.silenced = true;

                break;

            case FEAR:

                target.feared = true;

                break;
        }

        if(target.health <= 0) {

            target.health = 0;

            target.dead = true;
        }
    }

    /**
     * Effect bittiğinde flagleri temizler.
     */
    private void removeEffectFlags(
        LivingEntity target,
        StatusEffectInstance effect) {

        switch(effect.effectType) {

            case FREEZE:

                target.frozen = false;
                break;

            case SLOW:

                target.slowed = false;
                break;

            case STUN:

                target.stunned = false;
                break;

            case SILENCE:

                target.silenced = false;
                break;

            case FEAR:

                target.feared = false;
                break;

            default:
                break;
        }
    }

    /**
     * Hasar sırasında effect uygulama.
     *
     * Şimdilik boş.
     * Daha sonra:
     * - Weapon effects
     * - Spell effects
     * - Monster effects
     * buraya bağlanacak.
     */
    public void tryApplyEffects(
        LivingEntity attacker,
        LivingEntity defender,
        DamageInstance damage) {

    }
}
