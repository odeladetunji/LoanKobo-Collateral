package com.services;

import com.models.Collateral;
import com.models.ID;

import java.util.List;

public interface CollateralServiceInterface {
    List<Collateral> getCollaterals(ID payload);
    String addCollateral(Collateral payload);
    String deleteCollateral(ID payload);
    String editCollateral(Collateral payload);
}
