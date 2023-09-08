package name.record_mod.registry;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class Sounds {

    public static final Identifier COUNTDOWN = new Identifier("record:countdown");
    public static SoundEvent COUNTDOWN_EVENT = SoundEvent.of(COUNTDOWN);

    public static final Identifier SUNSET = new Identifier("record:sunset");
    public static SoundEvent SUNSET_EVENT = SoundEvent.of(SUNSET);
}
