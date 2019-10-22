package com.factory;

import com.models.Collateral;
import com.models.ID;

public abstract class AbstractFactory {
    public abstract Collateral getCollateral();
    public abstract ID getIdentity();
}
