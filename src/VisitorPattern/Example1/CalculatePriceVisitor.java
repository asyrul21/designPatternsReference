package VisitorPattern.Example1;

public class CalculatePriceVisitor extends Visitor{

    double normalItemTotalPrice = 0;
    double vegetarianItemTotalPrice = 0;
    @Override
    public void visitNormalMenuItem(NormalMenuItem item) {
        normalItemTotalPrice = normalItemTotalPrice + item.getPrice();
    }

    @Override
    public void visitVegetarianMenuItem(VegetarianMenuItem item) {
        vegetarianItemTotalPrice = vegetarianItemTotalPrice + item.getPrice();
    }

    public double getNormalItemTotalPrice(){
        return normalItemTotalPrice;
    }

    public double getVegetarianItemTotalPrice(){
        return vegetarianItemTotalPrice;
    }
}
