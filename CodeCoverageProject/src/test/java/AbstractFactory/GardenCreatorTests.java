package AbstractFactory;


import AbstractFactory.GardenCreator.IranianGardenBuilder;
import AbstractFactory.GardenCreator.JapaneseGardenBuilder;
import AbstractFactory.Plants.Flower.G1Flower;
import AbstractFactory.Plants.Flower.KhatmiFlower;
import AbstractFactory.Plants.Tree.ChenarTree;
import AbstractFactory.Plants.Tree.J1Tree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class GardenCreatorTests {
    @Test
    public void iranianGardenBuilderCreatesIranianFlower() {
        IranianGardenBuilder iranianGardenBuilder = new IranianGardenBuilder();
        KhatmiFlower khatmiFlower = (KhatmiFlower) iranianGardenBuilder.createFlower();
        String gotMessage = khatmiFlower.getMessage();
        String expectedMessage = "Khatmi flower created";
        assertEquals(gotMessage, expectedMessage);
    }

    @Test
    public void iranianGardenBuilderDoesNotCreateJapanesePlants() {
        IranianGardenBuilder iranianGardenBuilder = new IranianGardenBuilder();
        assertThrows(ClassCastException.class, () -> {
            G1Flower g1Flower = (G1Flower) iranianGardenBuilder.createFlower();
        });
        assertThrows(ClassCastException.class, () -> {
            J1Tree j1Tree = (J1Tree) iranianGardenBuilder.createTree();
        });
    }

    @Test
    public void japaneseGardenBuilderCreatesJapaneseFlower() {
        JapaneseGardenBuilder japaneseGardenBuilder = new JapaneseGardenBuilder();
        G1Flower g1Flower = (G1Flower) japaneseGardenBuilder.createFlower();
        String gotMessage = g1Flower.getMessage();
        String expectedMessage = "G1 flower created";
        assertEquals(gotMessage, expectedMessage);
    }

    @Test
    public void japaneseGardenBuilderDoesNotCreateIranianPlants() {
        JapaneseGardenBuilder japaneseGardenBuilder = new JapaneseGardenBuilder();
        assertThrows(ClassCastException.class, () -> {
            KhatmiFlower khatmi = (KhatmiFlower) japaneseGardenBuilder.createFlower();
        });
        assertThrows(ClassCastException.class, () -> {
            ChenarTree chenarTree = (ChenarTree) japaneseGardenBuilder.createFlower();
        });
    }

    @Test
    public void iranianGardenBuilderCreatesIranianTree() {
        IranianGardenBuilder iranianGardenBuilder = new IranianGardenBuilder();
        ChenarTree iranTree = (ChenarTree) iranianGardenBuilder.createTree();
        String gotMessage = iranTree.getMessage();
        String expectedMessage = "Chenar tree created";
        assertEquals(gotMessage, expectedMessage);
    }


    @Test
    public void japaneseGardenBuilderCreatesJapaneseTree() {
        JapaneseGardenBuilder japaneseGardenBuilder = new JapaneseGardenBuilder();
        J1Tree j1Tree = (J1Tree) japaneseGardenBuilder.createTree();
        String gotMessage = j1Tree.getMessage();
        String expectedMessage = "J1 tree created";
        assertEquals(gotMessage, expectedMessage);
    }

}
