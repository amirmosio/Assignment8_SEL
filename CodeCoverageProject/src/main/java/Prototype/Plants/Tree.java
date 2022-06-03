package Prototype.Plants;

public class Tree extends Plant {
    public int height;

    public Tree(Tree target) {
        super(target);
        if (target != null) {
            this.height = target.height;
        }
    }

    public Tree() {

    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tree)) {
            return false;
        }
        if (!(super.equals(o))) {
            return false;
        }
        Tree oT = (Tree) o;
        return oT.height == this.height;
    }

    @Override
    public Plant clone() {
        return new Tree(this);
    }
}