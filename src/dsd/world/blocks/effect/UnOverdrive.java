package dsd.world.blocks.effect;

import mindustry.game.Team;
import mindustry.gen.Building;
import mindustry.gen.Teamc;
import mindustry.graphics.Drawf;
import mindustry.logic.Ranged;
import mindustry.world.Block;
import mindustry.world.meta.BlockGroup;
import mindustry.world.meta.Env;
import mindustry.world.meta.Stat;
import mindustry.world.meta.StatUnit;

import static mindustry.Vars.*;

import arc.graphics.Color;
import arc.math.Mathf;
import arc.util.Tmp;

public class UnOverdrive extends Block {
  public float speedBoost;
  public float range;
  public Color baseColor = Color.valueOf("feb380");
  public Color phaseColor = Color.valueOf("ffd59e");

  public UnOverdrive(String name) {
    super(name);
    this.range = 120f;
    this.speedBoost = 0.5f;
    this.solid = true;
    this.update = true;
    this.group = BlockGroup.projectors;
    this.hasPower = true;
    this.hasItems = false;
    this.canOverdrive = false;
    this.emitLight = true;
    this.lightRadius = 50f;
    this.envEnabled |= Env.space;
  }

  @Override
  public boolean outputsItems() {
    return false;
  }

  @Override
  public void drawPlace(int x, int y, int rotation, boolean valid) {
    super.drawPlace(x, y, rotation, valid);
    Drawf.dashCircle(x * tilesize + offset, y * tilesize + offset, range, baseColor);
    indexer.eachBlock(Team.crux, x * tilesize + offset, y * tilesize + offset, range,
        other -> other.block.canOverdrive,
        other -> Drawf.selected(other, Tmp.c1.set(baseColor).a(Mathf.absin(4f, 1f))));
  }

  @Override
  public void setStats() {
    super.setStats();
    stats.add(Stat.speedIncrease, "倍率：" + (int) (speedBoost * 100f) + "%");
    stats.add(Stat.range, range / tilesize, StatUnit.blocks);
  }

  public class UnOverdriveBuild extends Building implements Ranged {
    @Override
    public float range() {
      return range;
    }

    @Override
    public void drawSelect() {
      float realRange = range;
      indexer.eachBlock(Team.crux, x * tilesize + offset, y * tilesize + offset, realRange,
          other -> other.block.canOverdrive,
          other -> Drawf.selected(other, Tmp.c1.set(baseColor).a(Mathf.absin(4f, 1f))));
    }

    @Override
    public void updateTile() {
      indexer.eachBlock(Team.crux, x * tilesize + offset, y * tilesize + offset, range,
          other -> other.block.canOverdrive,
          other -> other.applyBoost(-speedBoost, 1f));
    }
  }
}
