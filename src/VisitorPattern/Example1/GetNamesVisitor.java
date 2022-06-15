package VisitorPattern.Example1;

import java.util.ArrayList;

public class GetNamesVisitor extends Visitor{
    public ArrayList<String> normalMenuItemNames = new ArrayList<String>();
    public ArrayList<String> vegetarianMenuItemNames = new ArrayList<String>();


    @Override
    public void visitNormalMenuItem(NormalMenuItem item) {
        normalMenuItemNames.add(item.getName());
    }

    @Override
    public void visitVegetarianMenuItem(VegetarianMenuItem item) {
        vegetarianMenuItemNames.add(item.getName());
    }

    public String getNormalMenuItemNames(){
        return normalMenuItemNames.toString();
    }

    public String getVegetarianMenuItemNames(){
        return vegetarianMenuItemNames.toString();
    }
}
