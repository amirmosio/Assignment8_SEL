package Prototype;

import Prototype.Garden.Garden;
import Prototype.Plants.Flower;
import Prototype.Plants.Plant;
import Prototype.Plants.Tree;
import org.junit.Test;
import static org.junit.Assert.*;

public class GardenTest {

    @Test
    public void createGarden(){
        Garden garden = new Garden();
        Plant plant1 = garden.get("flower");
        Plant plant2 = garden.get("tree");
        Plant plant3 = garden.get("flower");
        assertEquals(plant1, plant3);
        assertNotEquals(plant1, plant2);
        assertTrue((plant1 != plant3));
    }

    @Test
    public void wrongCreateGarden(){
        Garden garden = new Garden();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            garden.get("grass");
        });
        String realMessage = "wrong type";
        assertEquals(realMessage, exception.getMessage());

    }
    @Test
    public void createTree(){
        Tree tree = new Tree();
        tree.color = "green";
        tree.isLiveInApartment = false;
        tree.height = 2;

        Tree nTree = (Tree) tree.clone();
        assertEquals(nTree, tree);

        // check the objects are different objects
        assertNotSame(nTree, tree);
    }

    @Test
    public void createFlower(){
        Flower flower = new Flower();
        flower.lifeTime = 4;
        flower.isLiveInApartment = true;
        flower.color = "yellow";

        Flower flower1 = (Flower) flower.clone();
        assertEquals(flower1, flower);
        assertNotSame(flower, flower1);





    }
}