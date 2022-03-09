package CompositePattern.Example1;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    // MenuItem is a BRANCH. Only override methods that are applicable to the branch node.
    ArrayList<MenuComponent> menuComponents  = new ArrayList<MenuComponent>();
    String name;
    String description;

    public Menu(String name, String des){
        this.name = name;
        this.description = des;
    }

    // Overriding Composite methods
    public void add(MenuComponent com){
        this.menuComponents.add(com);
    }

    public void remove(MenuComponent com){
        this.menuComponents.remove(com);
    }

    public MenuComponent getChild(int index){
        return this.menuComponents.get(index);
    }

    // Overriding Operation methods
    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        // we execute all of child's print() method
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent =
                    (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
}
