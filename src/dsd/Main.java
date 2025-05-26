package dsd;

import arc.util.Log;
import dsd.content.DSDBlocks;
import dsd.content.DSDPlanets;
import dsd.content.DSDUnits;
import mindustry.mod.Mod;
import mindustry.world.blocks.production.BeamDrill;
import mindustry.world.meta.BlockGroup;

public class Main extends Mod {
//  public static BeamDrill beamdrill;

  public Main() {
    Log.info("Start to load dsd");
  }
/**
  @Override
  public void init() {
    beamdrill.group = BlockGroup.drills;
  }*/

  @Override
  public void loadContent() {
    DSDPlanets.load();
     DSDUnits.load();
    DSDBlocks.load();
    Log.info("loaded blocks successfully");
    ModJS.DawnMods();
  }

}
