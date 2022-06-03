package AbstractFactory.App;

import AbstractFactory.GardenCreator.GardenBuilder;
import AbstractFactory.Plants.Flower.Flower;
import AbstractFactory.Plants.Tree.Tree;

public class GardenHandler {
    private Flower flower;
    private Tree tree;

    public GardenHandler(GardenBuilder gardenBuilder){
        flower = gardenBuilder.createFlower();
        tree = gardenBuilder.createTree();
    }
    public void create(){
        System.out.println(flower.getMessage());
        System.out.println(tree.getMessage());

    }
}
