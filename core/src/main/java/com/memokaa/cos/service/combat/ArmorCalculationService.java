package com.memokaa.cos.service.combat;

public class ArmorCalculationService {

    /**
     * Armor azaltma formülü
     */
    public double calculateDamageAfterArmor(
        double damage,
        double armor) {

        double reduction =
            armor / (armor + 100.0);

        return damage * (1.0 - reduction);
    }
}
