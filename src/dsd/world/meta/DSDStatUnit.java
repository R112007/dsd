package dsd.world.meta;

import mindustry.gen.Iconc;
import mindustry.world.meta.StatUnit;

public class DSDStatUnit {

  public static final StatUnit reduce;
  static {
    reduce = new StatUnit("reduce", "[white]" + Iconc.left + "[]");
  }
}
