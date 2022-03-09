package CompositePattern.Example2;

public class Waitress {
    MenuComponent allMenus; // the root of the tree

    public Waitress(MenuComponent root){
        this.allMenus = root;
    }

    public void printMenu(){
        this.allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator rootIterator = this.allMenus.createIterator();

        System.out.println("\nVEGETARIAN MENU\n----");
        while(rootIterator.hasNext()){
            MenuComponent component = (MenuComponent)rootIterator.next();
            try{
                if(component.isVegetarian()){
                    component.print();
                }
            }catch (UnsupportedOperationException e){
                // do nothing
            }
        }
    }
}
