package dsd.world.meta;

import mindustry.world.meta.Stat;

public class DSDStats {

  public static Stat waittime;
  public static Stat length;
  static {
    waittime = new Stat("waittime");
    length = new Stat("length");
  }
}
