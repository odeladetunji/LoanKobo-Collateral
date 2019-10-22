package com.factory;

public class ProducerFactory {
    public static AbstractFactory newEntityFactory(){ return new EntityFactory(); }
}
