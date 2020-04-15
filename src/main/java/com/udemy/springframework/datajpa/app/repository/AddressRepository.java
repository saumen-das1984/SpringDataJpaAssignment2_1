package com.udemy.springframework.datajpa.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.udemy.springframework.datajpa.app.domain.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
