package cn.nukkit.level.sound;

import cn.nukkit.math.Vector3;
import cn.nukkit.network.protocol.LevelEventPacket;

/**
 * Sound played when a Totem of Undying is consumed.
 * Based on the vanilla PocketMine-MP reference implementation.
 */
public class TotemSound extends LevelEventSound {

    public TotemSound(Vector3 pos) {
        this(pos, 0);
    }

    public TotemSound(Vector3 pos, float pitch) {
        super(pos, LevelEventPacket.EVENT_SOUND_TOTEM, pitch);
    }
}
