package com.dao;

import com.entity.Collateral;
import org.springframework.data.repository.CrudRepository;

public interface CollateralRepository extends CrudRepository<Collateral, Long> {
    void delete(Long id);
}
