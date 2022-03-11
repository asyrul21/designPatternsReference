package ProxyPattern.Example3;

import java.lang.reflect.*;

public class NonOwnerInvocationHandler implements InvocationHandler {
    Person person;

    public NonOwnerInvocationHandler(Person person){
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try{
            if(method.getName().startsWith("get")){
                return method.invoke(person, args);
            }
            else if(method.getName().equals("setGeekRating")){
                // only other people allowed to make updates
                // to this field
                return method.invoke(person, args);
            }
            else if(method.getName().startsWith("set")){
                // only owner is allowed to set personal details
                throw new IllegalAccessException();
            }
        }catch(InvocationTargetException e){
            e.printStackTrace();
        }

        return null;
    }
}
