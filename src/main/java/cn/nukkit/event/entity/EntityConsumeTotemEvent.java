package cn.nukkit.event.entity;

import cn.nukkit.entity.Entity;
import cn.nukkit.event.Cancellable;
import cn.nukkit.event.HandlerList;

/**
 * Called when a totem of undying is consumed to save an entity from death.
 * Cancelling this event will prevent the totem from being consumed,
 * and the entity will die normally.
 */
public class EntityConsumeTotemEvent extends EntityEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    public static HandlerList getHandlers() {
        return handlers;
    }

    public EntityConsumeTotemEvent(Entity entity) {
        this.entity = entity;
    }
}
