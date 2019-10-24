package com.controllers;

import com.models.Collateral;
import com.models.ID;
import com.services.CollateralServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CollateralControllers {
    @Autowired
    CollateralServiceInterface collateralServiceInterface;

    @ResponseBody
    @GetMapping(path = "/")
    public String ping(){
        return "ping successfull";
    }

    @ResponseBody
    @PostMapping(path = "/addCollateral")
    public String addCollateral(@RequestBody Collateral payload){
        return collateralServiceInterface.addCollateral(payload);
    }

    @ResponseBody
    @PostMapping(path = "/getCollateral")
    public List<Collateral> getCollateral(@RequestParam ID payload){
        return collateralServiceInterface.getCollaterals(payload);
    }

    @ResponseBody
    @PostMapping(path = "/editCollateral")
    public String editCollateral(@RequestBody Collateral payload){
        return collateralServiceInterface.editCollateral(payload);
    }

    @ResponseBody
    @PostMapping(path = "/deleteCollateral")
    public String deleteCollateral(@RequestParam ID payload){
        return collateralServiceInterface.deleteCollateral(payload);
    }
}
