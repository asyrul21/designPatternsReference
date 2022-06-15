package VisitorPattern.Example1;

public abstract class MenuItem extends MenuComponent {
    @Override
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
}
