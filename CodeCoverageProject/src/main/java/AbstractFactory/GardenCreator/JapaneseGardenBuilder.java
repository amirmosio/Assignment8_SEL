package AbstractFactory.GardenCreator;

import AbstractFactory.Plants.Flower.Flower;
import AbstractFactory.Plants.Flower.G1Flower;
import AbstractFactory.Plants.Tree.J1Tree;
import AbstractFactory.Plants.Tree.Tree;

public class JapaneseGardenBuilder extends GardenBuilder {
    @Override
    public Flower createFlower() {
        return new G1Flower();
    }

    @Override
    public Tree createTree() {
        return new J1Tree();
    }

}
