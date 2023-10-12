package name.record_mod.sound;

import name.record_mod.RecordMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSound {
    public static SoundEvent COUNTDOWN = registerSoundEvent("countdown");
    public static SoundEvent SUNSET = registerSoundEvent("sunset");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(RecordMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}
