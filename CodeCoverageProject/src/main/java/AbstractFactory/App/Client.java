package AbstractFactory.App;

import AbstractFactory.GardenCreator.GardenBuilder;
import AbstractFactory.GardenCreator.IranianGardenBuilder;

public class Client {
    public static void main(String[] args) {
//        Testing create object
        GardenHandler handler;
        GardenBuilder gb;
        gb = new IranianGardenBuilder();
        handler = new GardenHandler(gb);
        handler.create();
    }
}
