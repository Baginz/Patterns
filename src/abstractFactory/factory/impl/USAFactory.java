package abstractFactory.factory.impl;

import abstractFactory.factory.interfaces.TransportFactory;
import abstractFactory.transport.interfaces.Aircraft;
import abstractFactory.transport.impl.aircraft.Boeing747;
import abstractFactory.transport.interfaces.Car;
import abstractFactory.transport.impl.car.Porsche;

// американские транспортные средства
public class USAFactory implements TransportFactory{

    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }

}
