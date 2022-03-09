package CompositePattern.Example1;

public class Waitress {
    MenuComponent allMenus; // the root of the tree

    public Waitress(MenuComponent root){
        this.allMenus = root;
    }

    public void printMenu(){
        this.allMenus.print();
    }
}
