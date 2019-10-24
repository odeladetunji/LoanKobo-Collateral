package com.dao;

import com.entity.Collateral;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CollateralRepository extends CrudRepository<Collateral, Long> {
    @Override
    void delete(Collateral entity);

    @Override
    Optional<Collateral> findById(Long aLong);
}


















