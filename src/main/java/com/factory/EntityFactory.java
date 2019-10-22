package com.factory;

import com.models.Collateral;
import com.models.ID;

public class EntityFactory extends AbstractFactory{
    @Override
    public Collateral getCollateral(){ return new Collateral(); }

    @Override
    public ID getIdentity(){ return new ID(); }
}
