package com.memokaa.cos.manager.template;

import java.util.HashMap;
import java.util.Map;

import com.memokaa.cos.gameobject.template.ObjectTemplate;

/**
 * Bütün templateleri bellekte tutar.
 */
public class TemplateManager {

    /**
     * templateId -> template
     */
    private final Map<String, ObjectTemplate> templates =
        new HashMap<>();

    /**
     * Template ekle.
     */
    public void registerTemplate(
        ObjectTemplate template) {

        if(template == null) {
            return;
        }

        templates.put(
            template.id,
            template);
    }

    /**
     * Template getir.
     */
    public ObjectTemplate getTemplate(
        String templateId) {

        return templates.get(
            templateId);
    }

    /**
     * Tip güvenli template çekme.
     */
    @SuppressWarnings("unchecked")
    public <T extends ObjectTemplate> T getTemplate(
        String templateId,
        Class<T> clazz) {

        ObjectTemplate template =
            templates.get(templateId);

        if(template == null) {
            return null;
        }

        if(!clazz.isInstance(template)) {
            return null;
        }

        return (T) template;
    }

    /**
     * Template var mı?
     */
    public boolean contains(
        String templateId) {

        return templates.containsKey(
            templateId);
    }

    /**
     * Temizle.
     */
    public void clear() {

        templates.clear();
    }
}
