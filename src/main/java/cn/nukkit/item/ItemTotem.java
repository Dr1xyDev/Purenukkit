package cn.nukkit.item;

/**
 * Totem of Undying
 *
 * Saves the player from death when held in offhand or main hand.
 * Stack size is 1 (not stackable).
 *
 * Behavior (vanilla):
 *   - Sets player health to 1 (instead of dying)
 *   - Gives Regeneration II (45 seconds / 900 ticks)
 *   - Gives Absorption II (5 seconds / 100 ticks)
 *   - Gives Fire Resistance I (40 seconds / 800 ticks)
 *   - Plays the totem animation + sound
 *   - Consumes the totem item
 *
 * author: Dr1xy
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

    @Override
    public int getMaxStackSize() {
        return 1;
    }
}
