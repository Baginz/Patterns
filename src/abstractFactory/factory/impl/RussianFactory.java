package abstractFactory.factory.impl;

import abstractFactory.factory.interfaces.TransportFactory;
import abstractFactory.transport.interfaces.Aircraft;
import abstractFactory.transport.interfaces.Car;
import abstractFactory.transport.impl.car.Niva;
import abstractFactory.transport.impl.aircraft.TU134;

// российские транспортные средства
public class RussianFactory implements TransportFactory{

    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }

}
