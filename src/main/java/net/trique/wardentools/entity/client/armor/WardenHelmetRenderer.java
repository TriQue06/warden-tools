package net.trique.wardentools.entity.client.armor;

import net.trique.wardentools.item.custom.WardenHelmetItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class WardenHelmetRenderer extends GeoArmorRenderer<WardenHelmetItem> {
    public WardenHelmetRenderer() {
        super(new WardenHelmetModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";

    }
}
