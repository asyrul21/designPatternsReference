package ProxyPattern.Example3;

import java.lang.reflect.*;

public class OwnerInvocationHandler implements InvocationHandler {
    Person person;

    public OwnerInvocationHandler(Person person){
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try{
            if(method.getName().startsWith("get")){
                // proceed to invoke that method
                return method.invoke(person, args);
            }
            else if(method.getName().equals("setGeekRating")){
                // only other people allowed to make updates
                // to this field
                throw new IllegalAccessException();
            }
            else if(method.getName().startsWith("set")){
                // proceed
                return method.invoke(person, args);
            }
        }catch(InvocationTargetException e){
            e.printStackTrace();
        }

        return null;
    }
}
