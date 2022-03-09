package CompositePattern.Example2;

import java.util.ArrayList;

public class Menu extends MenuComponent {
    Iterator menuIterator = null;
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
        Iterator iterator = new MenuComponentIterator(this.menuComponents);
        while (iterator.hasNext()) {
            MenuComponent menuComponent =
                    (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public CompositePattern.Example2.Iterator createIterator() {
        if(menuIterator == null){
            Iterator menuComponentIterator = new MenuComponentIterator(this.menuComponents);
            menuIterator = new CompositeIterator(menuComponentIterator);
        }
        return this.menuIterator;
    }
}
