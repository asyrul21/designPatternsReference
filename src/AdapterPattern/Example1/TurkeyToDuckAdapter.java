package AdapterPattern.Example1;

public class TurkeyToDuckAdapter implements Duck {
    Turkey turk;

    public TurkeyToDuckAdapter(Turkey t){
        this.turk = t;
    }

    @Override
    public void quack() {
        this.turk.gobble();
    }

    @Override
    public void fly() {
        // turkeys fly short distances
        // so upon transformation to a duck
        // its flight ability is multiplied
        for(int i=0; i < 5; i++){
            this.turk.fly();
        }
    }
}
