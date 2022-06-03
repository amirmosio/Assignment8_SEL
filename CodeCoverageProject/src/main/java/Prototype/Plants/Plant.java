package Prototype.Plants;

public package Prototype.Plants;

import java.util.Objects;

public abstract class Plant {
    public String color;
    public boolean isLiveInApartment;

    public Plant(Plant target) {
        if (target != null) {
            this.color = target.color;
            this.isLiveInApartment = target.isLiveInApartment;
        }
    }

    public Plant() {
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Plant)) {
            return false;
        }
        Plant oC = (Plant) o;
        return Objects.equals(oC.color, color) && oC.isLiveInApartment == isLiveInApartment;
    }

    public abstract Plant clone();
} Plant {
    
}
