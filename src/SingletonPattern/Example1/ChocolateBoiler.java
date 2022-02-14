package SingletonPattern.Example1;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    // singleton methods ***********************
    private static ChocolateBoiler chocoBoiler;
    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }
    public static synchronized ChocolateBoiler getInstance(){
        if(chocoBoiler == null){
            System.out.println("No instance exists. Creating new...");
            return chocoBoiler = new ChocolateBoiler();
        }
        System.out.println("Instance already exist.");
        return chocoBoiler;
    }
    // singleton methods ***********************

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            boiled = true;
        }
    }

    public Boolean isEmpty(){
        return empty;
    }

    public Boolean isBoiled(){
        return boiled;
    }
}
