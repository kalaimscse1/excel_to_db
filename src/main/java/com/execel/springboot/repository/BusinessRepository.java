package com.execel.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.execel.springboot.model.BusinessPartner;

/**
 * stores excel data
 * 
 * 
 * @author Kalaivanan 
 *
 */
@Repository
public interface BusinessRepository extends CrudRepository<BusinessPartner, Integer> {

}
