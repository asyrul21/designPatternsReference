package PrototypePattern.Example1;

public class Client {
    public static void main(String[] args) {
        // prototypes
        Monster m1 = new Dragon("Blacky Dragon", true);
        Monster m2 = new Drakon("Reddy Drakon", 3, true);

        spitPoison(m1);
        spitPoison(m2);

        System.out.println();

        Monster mx = createNewDragon(m1, "Jacky Dragon", false);
        System.out.println(mx);
    }

    public static Monster spitPoison(Monster p) {
        // This code doesn't know or care what the concrete type of p is
        Monster prototypeMonster = null;
        try {
            prototypeMonster = p.copy();
            // do something useful with pCopy
            prototypeMonster.spitPoison();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeMonster;
    }

    public static Monster createNewDragon(Monster defaultPrototype, String name, Boolean hasWings) {
        Monster newDragon = null;
        try {
            System.out.println("Creating a new dragon using the Default Prototype Copy!");
            newDragon = defaultPrototype.copy();

            // modify some fields
            newDragon.setName(name);
            newDragon.setHasWings(false);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return newDragon;
    }
}
