package PrototypePattern.Example1;

public abstract class Monster implements Cloneable {
    boolean eatsChildren = true;
    boolean hasWings = false;
    int numHeads = 1;
    boolean canBreatheFire = false;
    String name;
    public Monster(String name) {
        this.name = name;
    }
    public void spitPoison() {
        // default behavior is cant spit poison
        System.out.println(this.name + " can't spit poison :(");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHasWings(Boolean hasWings){
        this.hasWings = hasWings;
    }
    public abstract Monster copy() throws CloneNotSupportedException;

    public String toString() {
        StringBuffer s = new StringBuffer("I'm a monster named " + this.name + " with " + this.numHeads + " head(s). ");
        if (this.canBreatheFire) { s.append("I can breathe fire. "); }
        if (this.eatsChildren) { s.append("I eat children. "); }
        if (this.hasWings) { s.append("I have wings. "); }
        return s.toString();
    }
}
