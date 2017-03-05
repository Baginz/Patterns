package abstractFactory.start;

import abstractFactory.factory.impl.RussianFactory;
import abstractFactory.factory.impl.USAFactory;
import abstractFactory.factory.interfaces.TransportFactory;
import abstractFactory.transport.interfaces.Aircraft;

public class Start {
    
    private static TransportFactory factory;
    
    public static void main(String[] args) {
      
        if (true){
            factory = new RussianFactory();
        }else{
            factory = new USAFactory();
        }
        
        
        factory.createAircraft();
        factory.createCar();
        
        
    }

}
