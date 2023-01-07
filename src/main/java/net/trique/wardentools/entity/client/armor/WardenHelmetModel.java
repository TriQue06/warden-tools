package net.trique.wardentools.entity.client.armor;

import net.minecraft.util.Identifier;
import net.trique.wardentools.WardenTools;
import net.trique.wardentools.item.custom.WardenHelmetItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WardenHelmetModel extends AnimatedGeoModel<WardenHelmetItem> {
    @Override
    public Identifier getModelResource(WardenHelmetItem object) {
        return new Identifier(WardenTools.MOD_ID, "geo/warden_helmet.geo.json");
    }

    @Override
    public Identifier getTextureResource(WardenHelmetItem object) {
        return new Identifier(WardenTools.MOD_ID, "textures/models/armor/warden_helmet.png");
    }

    @Override
    public Identifier getAnimationResource(WardenHelmetItem animatable) {
        return new Identifier(WardenTools.MOD_ID, "animations/armor_animation.json");
    }
}
