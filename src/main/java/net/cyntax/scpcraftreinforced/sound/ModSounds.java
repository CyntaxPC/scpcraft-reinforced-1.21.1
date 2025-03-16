package net.cyntax.scpcraftreinforced.sound;

import net.cyntax.scpcraftreinforced.SCPcraftReinforced;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent GENDER_SWITCHER_SONG = registerSoundEvent("gender_switcher_song");
    public static final RegistryKey<JukeboxSong> GENDER_SWITCHER_SONG_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SCPcraftReinforced.MOD_ID, "gender_switcher_song"));

    public static final SoundEvent BURNING_MAN_SONG = registerSoundEvent("burning_man_song");
    public static final RegistryKey<JukeboxSong> BURNING_MAN_SONG_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SCPcraftReinforced.MOD_ID, "burning_man_song"));

    public static final SoundEvent EYEPODS_SONG = registerSoundEvent("eyepods_song");
    public static final RegistryKey<JukeboxSong> EYEPODS_SONG_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SCPcraftReinforced.MOD_ID, "eyepods_song"));

    public static final SoundEvent RED_ICE_SONG = registerSoundEvent("red_ice_song");
    public static final RegistryKey<JukeboxSong> RED_ICE_SONG_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SCPcraftReinforced.MOD_ID, "red_ice_song"));

    public static final SoundEvent SWAMP_WOMAN_SONG = registerSoundEvent("swamp_woman_song");
    public static final RegistryKey<JukeboxSong> SWAMP_WOMAN_SONG_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SCPcraftReinforced.MOD_ID, "swamp_woman_song"));

    public static final SoundEvent UNSEEN_MOLD_SONG = registerSoundEvent("unseen_mold_song");
    public static final RegistryKey<JukeboxSong> UNSEEN_MOLD_SONG_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SCPcraftReinforced.MOD_ID, "unseen_mold_song"));

    public static final SoundEvent DARK_FORM_SONG = registerSoundEvent("dark_form_song");
    public static final RegistryKey<JukeboxSong> DARK_FORM_SONG_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SCPcraftReinforced.MOD_ID, "dark_form_song"));

    public static final SoundEvent TELEKILL_ALLOY_SONG = registerSoundEvent("telekill_alloy_song");
    public static final RegistryKey<JukeboxSong> TELEKILL_ALLOY_SONG_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SCPcraftReinforced.MOD_ID, "telekill_alloy_song"));

    public static final SoundEvent SKELETON_KEY_SONG = registerSoundEvent("skeleton_key_song");
    public static final RegistryKey<JukeboxSong> SKELETON_KEY_SONG_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SCPcraftReinforced.MOD_ID, "skeleton_key_song"));

    public static final SoundEvent SUPER_BALL_SONG = registerSoundEvent("super_ball_song");
    public static final RegistryKey<JukeboxSong> SUPER_BALL_SONG_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SCPcraftReinforced.MOD_ID, "super_ball_song"));

    public static final SoundEvent FOUNTAIN_OF_YOUTH_SONG = registerSoundEvent("fountain_of_youth_song");
    public static final RegistryKey<JukeboxSong> FOUNTAIN_OF_YOUTH_SONG_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SCPcraftReinforced.MOD_ID, "fountain_of_youth_song"));

    public static final SoundEvent EVERYTHING_TREE_SONG = registerSoundEvent("everything_tree_song");
    public static final RegistryKey<JukeboxSong> EVERYTHING_TREE_SONG_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SCPcraftReinforced.MOD_ID, "everything_tree_song"));

    public static final SoundEvent REWIND_MAN_SONG = registerSoundEvent("rewind_man_song");
    public static final RegistryKey<JukeboxSong> REWIND_MAN_SONG_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SCPcraftReinforced.MOD_ID, "rewind_man_song"));

    public static final SoundEvent SONG_OF_GENESIS_SONG = registerSoundEvent("song_of_genesis_song");
    public static final RegistryKey<JukeboxSong> SONG_OF_GENESIS_SONG_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SCPcraftReinforced.MOD_ID, "song_of_genesis_song"));

    public static final SoundEvent EYE_SPIDERS_SONG = registerSoundEvent("eye_spiders_song");
    public static final RegistryKey<JukeboxSong> EYE_SPIDERS_SONG_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SCPcraftReinforced.MOD_ID, "eye_spiders_song"));

    public static final SoundEvent LIVING_ROOM_SONG = registerSoundEvent("living_room_song");
    public static final RegistryKey<JukeboxSong> LIVING_ROOM_SONG_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SCPcraftReinforced.MOD_ID, "living_room_song"));





    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(SCPcraftReinforced.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        SCPcraftReinforced.LOGGER.info("Registering modded sounds from " +SCPcraftReinforced.MOD_ID);
    }
}
