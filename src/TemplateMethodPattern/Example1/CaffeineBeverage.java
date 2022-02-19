package TemplateMethodPattern.Example1;

public abstract class CaffeineBeverage {

    public final void prepareBeverage(){
        this.boilWater();
        this.brew();
        this.pourInCup();
        if(this.wantCondimentsHook()){
            this.addCondiments();
        }
    }

    public abstract void brew();
    public abstract void addCondiments();

    private void boilWater(){
        System.out.println("Boiling some water...");
    }

    private void  pourInCup(){
        System.out.println("Pouring water in cup...");
    }

    public Boolean wantCondimentsHook(){
        return true;
    }
}
