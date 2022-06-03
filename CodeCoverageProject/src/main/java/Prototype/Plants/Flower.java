package Prototype.Plants;

public class Flower extends Plant {
    public int lifeTime;


    public Flower(Flower target) {
        super(target);
        this.lifeTime = target.lifeTime;
    }

    public Flower(){

    }
    @Override
    public boolean equals(Object o){
        if (!(o instanceof Flower)){
            return false;
        }
        if (!(super.equals(o))){
            return false;
        }
        Flower oF = (Flower) o;
        return oF.lifeTime == this.lifeTime;
    }

    @Override
    public Plant clone() {
        return new Flower(this);
    }
}