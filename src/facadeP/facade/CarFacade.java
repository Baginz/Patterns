package facadeP.facade;

// фасад для работы 
import facadeP.parts.Door;
import facadeP.parts.Wheel;
import facadeP.parts.Zazhiganie;

public class CarFacade {

    private Door door = new Door();
    private Zazhiganie zazhiganie = new Zazhiganie();
    private Wheel wheel = new Wheel();

    public void go(){
        door.open();
        zazhiganie.fire();
        wheel.turn();
    }
    
        
    
}
