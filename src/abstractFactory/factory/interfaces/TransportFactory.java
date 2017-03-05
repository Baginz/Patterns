package abstractFactory.factory.interfaces;

import abstractFactory.transport.interfaces.Aircraft;
import abstractFactory.transport.interfaces.Car;

// фабрика по созданию транспортных средств
public interface TransportFactory {
    
    // что фабрика будет производить
    
    Car createCar();// автомобили
    
    Aircraft createAircraft(); // самолеты

}
