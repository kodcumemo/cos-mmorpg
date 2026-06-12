package com.memokaa.cos.gameobject.property;

import java.util.ArrayList;
import java.util.List;

import com.memokaa.cos.gameobject.template.ObjectTemplate;

public class PropertyTemplate extends ObjectTemplate {

    // Hangi item tiplerinde kullanılabilir
    public List<String> allowedItemTypes = new ArrayList<>();

    // Minimum değer
    public double minValue;

    // Maksimum değer
    public double maxValue;

    // Yüzdelik mi
    public boolean percentage;
}
