package net.trique.wardentools.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.trique.wardentools.WardenTools;

public class ModSounds {

    public static SoundEvent ASTRAY_ARCHIPELAGO = registerSoundEvent("astray_archipelago");
    public static SoundEvent FIZZ = registerSoundEvent("fizz");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(WardenTools.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent((id)));
    }
}
