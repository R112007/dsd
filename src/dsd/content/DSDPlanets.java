package dsd.content;

import arc.graphics.Color;
import mindustry.content.Planets;
import mindustry.graphics.g3d.SunMesh;
import mindustry.type.Planet;

public class DSDPlanets {

  public static Planet dsdsun;

  public static void load() {

    DSDPlanets.dsdsun = new Planet("dsdsun", null, 5.5f) {
      {
        // this.orbitRadius = 30;
        this.bloom = true;
        this.accessible = false;

        this.meshLoader = () -> new SunMesh(
            this, 4,
            5, 0.3, 1.7, 1.2, 1,
            1.1f,
            Color.valueOf("#140E28FF"),
            Color.valueOf("#E369CCFF"),
            Color.valueOf("#EC96BBFF"),
            Color.valueOf("#C35A9FFF"),
            Color.valueOf("#871263FF"),
            Color.valueOf("#904F91FF"));
      }
    };
  }
}
