package cn.nukkit.item;

/**
 * Totem of Undying
 *
 * Saves the player from death when held in offhand or main hand.
 * On activation:
 *   - Sets player health to 1 (instead of 0)
 *   - Gives Regeneration II (45 seconds / 900 ticks)
 *   - Gives Absorption II (20 seconds / 400 ticks)
 *   - Gives Fire Resistance I (40 seconds / 800 ticks)
 *   - Plays the totem animation on the client
 *   - Consumes the totem item
 *
 * author: Dr1xyDev
 */
public class ItemTotem extends Item {

    public ItemTotem() {
        this(0, 1);
    }

    public ItemTotem(Integer meta) {
        this(meta, 1);
    }

    public ItemTotem(Integer meta, int count) {
        super(TOTEM, meta, count, "Totem of Undying");
    }
}
