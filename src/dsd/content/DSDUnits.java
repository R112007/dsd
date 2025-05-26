package dsd.content;

import dsd.entities.abilities.FlashAbility;
import dsd.entities.abilities.NoDamaged;
import mindustry.content.Fx;
import mindustry.content.UnitTypes;
import mindustry.entities.Effect;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.effect.ParticleEffect;
import mindustry.graphics.Pal;
import mindustry.type.UnitType;
import mindustry.type.Weapon;

public class DSDUnits {

  public static UnitType test;
  public static Effect test1 = new ParticleEffect() {
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

  public static void load() {
    DSDUnits.test = new UnitType("test") {
      {
        this.constructor = UnitTypes.flare.constructor;
        this.controller = UnitTypes.flare.controller;
        this.flying = true;
        this.health = 500;
        this.speed = 2;
        this.abilities.add(new NoDamaged(120f));
        this.weapons.add(new Weapon() {
          {
            this.reload = 5.0f;
            this.x = -4.0f;
            this.y = 0.75f;
            this.top = false;
            this.ejectEffect = Fx.casing1;
            this.bullet = new BasicBulletType(3.0f, 16.0f) {
              {
                this.width = 7.0f;
                this.height = 13.0f;
                this.lifetime = 30.0f;
                this.shootEffect = Fx.shootSmall;
                this.smokeEffect = Fx.shootSmallSmoke;
                this.ammoMultiplier = 1.5f;
              }
            };

          }
        });
      }
    };
//    UnitTypes.dagger.abilities.add(new FlashAbility(20f, 3f, Fx.pulverizeMedium, 3f, 3f, false));
  }
}
