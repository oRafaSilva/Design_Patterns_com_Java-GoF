package one.digitalinnovation.gof.singleton;

// Singleton "Lazy Holder"
// @author oRafaSilva

public class SingletonLazyHolder {

    private static class INstanceHolder{
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return INstanceHolder.instancia;
    }
}