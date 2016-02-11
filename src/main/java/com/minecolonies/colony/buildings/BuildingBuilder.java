package com.minecolonies.colony.buildings;

import com.minecolonies.client.gui.WindowHutBuilder;
import com.minecolonies.colony.CitizenData;
import com.minecolonies.colony.Colony;
import com.minecolonies.colony.ColonyView;
import com.minecolonies.colony.jobs.Job;
import com.minecolonies.colony.jobs.JobBuilder;
import net.minecraft.util.ChunkCoordinates;

public class BuildingBuilder extends BuildingWorker
{
    public BuildingBuilder(Colony c, ChunkCoordinates l)
    {
        super(c, l);
    }

    @Override
    public String getSchematicName(){ return "Builder"; }

    @Override
    public int getMaxBuildingLevel(){ return 2; }

    @Override
    public String getJobName(){ return "Builder"; }

    @Override
    public Job createJob(CitizenData citizen)
    {
        return new JobBuilder(citizen);
    }

    public static class View extends BuildingWorker.View
    {
        public View(ColonyView c, ChunkCoordinates l)
        {
            super(c, l);
        }

        public com.blockout.views.Window getWindow()
        {
            return new WindowHutBuilder(this);
        }
    }
}
