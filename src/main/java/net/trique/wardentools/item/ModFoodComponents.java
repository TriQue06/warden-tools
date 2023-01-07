package net.trique.wardentools.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent SCULK_APPLE = (new FoodComponent.Builder()).hunger(5).saturationModifier(1.2F).
            statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 200, 0), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 2400, 0), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 2400, 0), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 0), 1.0F).

            statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2400, 1), 0.75F).
            statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 4800, 0), 0.75F).
            alwaysEdible().build();




}
