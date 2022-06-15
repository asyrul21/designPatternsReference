package VisitorPattern.Example1;

public class Waitress {
    MenuComponent allMenus; // the root of the tree

    public Waitress(MenuComponent root){
        this.allMenus = root;
    }

    public void printMenu(){
        this.allMenus.print();
    }

    public double calculateNormalItemsTotalPrice(){
        Visitor calculatePriceVisitor = new CalculatePriceVisitor();
        this.allMenus.accept(calculatePriceVisitor);
        return ((CalculatePriceVisitor) calculatePriceVisitor).getNormalItemTotalPrice();
    }

    public double calculateVegetarianItemsTotalPrice(){
        Visitor calculatePriceVisitor = new CalculatePriceVisitor();
        this.allMenus.accept(calculatePriceVisitor);
        return ((CalculatePriceVisitor) calculatePriceVisitor).getVegetarianItemTotalPrice();
    }

    public String getNormalItemNames(){
        Visitor getNamesVisitor = new GetNamesVisitor();
        this.allMenus.accept(getNamesVisitor);
        return ((GetNamesVisitor) getNamesVisitor).getNormalMenuItemNames();
    }

    public String getVegetarianItemNames(){
        Visitor getNamesVisitor = new GetNamesVisitor();
        this.allMenus.accept(getNamesVisitor);
        return ((GetNamesVisitor) getNamesVisitor).getVegetarianMenuItemNames();
    }
}
