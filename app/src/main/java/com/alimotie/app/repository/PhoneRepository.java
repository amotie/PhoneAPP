package com.alimotie.app.repository;


import com.alimotie.app.entity.Phone;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends CrudRepository<Phone, Integer> {
    Iterable<Phone> findBylocalFormat(@Param("localFormat")String localFormat);

}
