package AbstractFactory.GardenCreator;

import AbstractFactory.Plants.Flower.Flower;
import AbstractFactory.Plants.Tree.Tree;

public abstract class GardenBuilder {
   public abstract Flower createFlower();
   public abstract Tree createTree();
}
