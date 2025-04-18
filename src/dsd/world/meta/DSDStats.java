package dsd.world.meta;

import mindustry.world.meta.Stat;
import mindustry.world.meta.StatCat;

public class DSDStats {

  public static Stat waittime;
  public static Stat length;
  public static final Stat reducepercent;
  static {
    waittime = new Stat("waittime", StatCat.function);
    length = new Stat("length");
    reducepercent = new Stat("reducepercent", StatCat.function);
  }
}
