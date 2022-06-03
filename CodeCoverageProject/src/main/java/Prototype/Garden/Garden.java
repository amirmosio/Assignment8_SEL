package Prototype.Garden;

import Prototype.Plants.Flower;
import Prototype.Plants.Plant;
import Prototype.Plants.Tree;

import java.util.ArrayList;
import java.util.Objects;

public class Garden {

    public ArrayList<Plant> plants = new ArrayList<>();

    public Garden() {
        Flower flower = new Flower();
        flower.color = "red";
        flower.isLiveInApartment = true;
        flower.lifeTime = 3;

        Tree tree = new Tree();
        tree.color = "green";
        tree.isLiveInApartment = false;
        tree.height = 2;
        plants.add(flower);
        plants.add(tree);


    }

    public Plant get(String pType) throws IllegalArgumentException {
        if (Objects.equals(pType, "flower")) {
            return plants.get(0).clone();
        }
        if (Objects.equals(pType, "tree")) {
            return plants.get(1).clone();
        }
        throw  new IllegalArgumentException("wrong type");

    }
}