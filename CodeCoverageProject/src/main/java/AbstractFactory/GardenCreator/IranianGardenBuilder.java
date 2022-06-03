package AbstractFactory.GardenCreator;

import AbstractFactory.Plants.Flower.Flower;
import AbstractFactory.Plants.Flower.KhatmiFlower;
import AbstractFactory.Plants.Tree.ChenarTree;
import AbstractFactory.Plants.Tree.Tree;

public class IranianGardenBuilder extends GardenBuilder{
    @Override
   public Flower createFlower() {
        return new KhatmiFlower();
    }

    @Override
    public Tree createTree() {
        return new ChenarTree();
    }
}
