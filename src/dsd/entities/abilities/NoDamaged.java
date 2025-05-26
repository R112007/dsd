package dsd.entities.abilities;

import arc.util.Time;
import mindustry.entities.abilities.Ability;
import mindustry.gen.Unit;

public class NoDamaged extends Ability {
  public float time, timer = 0f;

  public NoDamaged() {
  }

  public NoDamaged(float time) {
    this.time = time;
  }

  @Override
  public void update(Unit unit) {
    timer += Time.delta;
    if (timer < time) {
      unit.type().killable = false;
    } else {
      unit.type().killable = true;
      if (timer >= time + 10f) {
        timer = 0f;
      }
    }
  }
}
