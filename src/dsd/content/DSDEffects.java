package dsd.content;

import mindustry.entities.Effect;
import mindustry.entities.effect.ParticleEffect;
import mindustry.graphics.Pal;

public class DSDEffects {

  public static Effect downeffect1;
  static {

    DSDEffects.downeffect1 = new ParticleEffect() {
      {
        this.particles = 9;
        this.length = 200;
        this.sizeFrom = 4;
        this.sizeTo = 0;
        this.lifetime = 50;
        this.cone = 360;
        this.colorFrom = Pal.bulletYellow;
        this.colorTo = Pal.bulletYellowBack;
      }
    };
  }
}
