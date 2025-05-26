package dsd.content;

import dsd.world.blocks.effect.DropItems;
import dsd.world.blocks.effect.UnOverdrive;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;

public class DSDBlocks {

  public static Block test;
  public static Block test1;

  public static void load() {
    DSDBlocks.test = new DropItems("test") {
      {
        this.health = 286;
        this.size = 2;
        this.range = 200;
        this.workeffect = DSDEffects.downeffect1;
        this.requirements(Category.effect, ItemStack.with(
            Items.titanium, 2, Items.metaglass, 2, Items.silicon, 1));
      }
    };
    DSDBlocks.test1 = new UnOverdrive("test1") {
      {
        this.health = 286;
        this.size = 2;
        this.range = 400;
        // this.workeffect = DSDEffects.downeffect1;
        this.requirements(Category.effect, ItemStack.with(
            Items.titanium, 2, Items.metaglass, 2, Items.silicon, 1));
      }
    };
  }
}
