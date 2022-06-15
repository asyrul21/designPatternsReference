package VisitorPattern.Example1;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    String name;
    String description;

    public Menu(String name, String des){
        this.name = name;
        this.description = des;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        this.menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        this.menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return this.menuComponents.get(i);
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getDescription(){
        return description;
    }

    @Override
    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        // we execute all of child's print() method
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        // we execute all of child's accept() method
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.accept(visitor);
        }
    }
}
