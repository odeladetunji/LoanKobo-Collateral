package com.services;

import com.config.BeanGenerators;
import com.dao.CollateralRepository;
import com.factory.AbstractFactory;
import com.factory.ProducerFactory;
import com.models.Collateral;
import com.models.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EndPoints implements CollateralServiceInterface {

    private BeanGenerators beanGenerators;

    @Autowired
    private  CollateralRepository collateralRepository;

    public BeanGenerators collateralBean(Collateral payload){
        beanGenerators.aCollateral().borrowersName = payload.borrowersName;
        beanGenerators.aCollateral().condition = payload.condition;
        beanGenerators.aCollateral().Id = payload.Id;
        beanGenerators.aCollateral().property_value = payload.property_value;
        beanGenerators.aCollateral().propertyName = payload.propertyName;
        beanGenerators.aCollateral().status = payload.status;

        return beanGenerators;
    }


    @Override
    public List<Collateral> getCollaterals(ID payload){
        Iterable<com.entity.Collateral> result = collateralRepository.findAll();
        if (((List<com.entity.Collateral>) result).isEmpty()) return new ArrayList<>();

        List<com.entity.Collateral> castedResult = (List<com.entity.Collateral>) result; // result is an iterable!

        AbstractFactory entityFactory = ProducerFactory.newEntityFactory();
        Collateral collateral = entityFactory.getCollateral();

        collateral.borrowersName = castedResult.get(0).borrowersName;
        collateral.condition = castedResult.get(0).condition;
        collateral.property_value = castedResult.get(0).property_value;
        collateral.status = castedResult.get(0).status;
        collateral.propertyName = castedResult.get(0).propertyName;
        collateral.Id = castedResult.get(0).Id;

        List<Collateral> finalResult = new ArrayList<>();
        finalResult.add(collateral);
        return finalResult;

    }



    @Override
    public String addCollateral (Collateral payload){

        try {
            collateralRepository.save(collateralBean(payload));
            return "Successfull";
        }catch (Exception ex){
            System.out.println(ex);
            return "unsuccessfull";
        }
    }

    @Override
    public String deleteCollateral(ID payload){
        try {
            collateralRepository.delete(payload.Id);
            return "deleted successfully";
        }catch (Exception ex){
            return "delete unsuccessfull";
        }
    }

    @Override
    public String editCollateral(Collateral payload){


        try {
            collateralRepository.save(collateralBean(payload));
            return "successfull";
        }catch (Exception ex){
            return "unsuccessfull";
        }

    }


}
