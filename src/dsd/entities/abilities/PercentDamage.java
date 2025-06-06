package dsd.entities.abilities;

import arc.scene.ui.layout.Table;
import arc.util.Log;
import mindustry.entities.abilities.Ability;
import mindustry.gen.Unit;
import mindustry.type.UnitType;

public class PercentDamage extends Ability {
  public float percent;
  float healthing;

  public PercentDamage(float percent) {
    this.percent = percent;
  }

  @Override
  public void init(UnitType type) {
    healthing = type.health;
  }

  @Override
  public void update(Unit unit) {
    if (healthdrop(unit)) {
      unit.health += percent * (healthdropamount(unit));
    }
    healthing = unit.health;
  }

  public boolean healthdrop(Unit unit) {
    return healthing > unit.health;
  }

  public float healthdropamount(Unit unit) {
    return healthing - unit.health;
  }

  @Override
  public String localized() {
    return "百分比减伤";
  }

  @Override
  public void addStats(Table t) {
    t.add("减伤倍率" + percent);
    t.row();
  }
}
