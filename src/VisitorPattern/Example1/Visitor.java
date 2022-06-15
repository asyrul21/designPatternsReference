package VisitorPattern.Example1;

import java.util.ArrayList;

public abstract class Visitor {
    public abstract void visitNormalMenuItem(NormalMenuItem item);
    public abstract void visitVegetarianMenuItem(VegetarianMenuItem item);
}
