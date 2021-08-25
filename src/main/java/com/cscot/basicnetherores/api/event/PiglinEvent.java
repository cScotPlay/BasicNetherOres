package com.cscot.basicnetherores.api.event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;

import java.util.List;

@Cancelable
public class PiglinEvent extends Event
{
    private final Level world;
    private final BlockPos pos;
    private final LivingEntity thief;
    private List<Piglin> guards;

    /**
     * This event fires within BlockOreBase#piglinGuards
     *
     * This event is {@link Cancelable}.
     * If this event is canceled no aggression against the thief occurs
     *
     * @param world world provided to BlockOreBase#pigmenGuards
     * @param pos BlockPos provided to BlockOreBase#pigmenGuards
     * @param thief LivingEntity that is being targeted
     */
    public PiglinEvent(Level world, BlockPos pos, LivingEntity thief, List<Piglin> guards)
    {
        super();
        this.world = world;
        this.pos = pos;
        this.thief = thief;
        this.guards = guards;
    }

    public Level getWorld()
    {
        return world;
    }

    public BlockPos getPos()
    {
        return pos;
    }

    public LivingEntity getThief()
    {
        return thief;
    }

    public List<Piglin> getGuards()
    {
        return guards;
    }
}