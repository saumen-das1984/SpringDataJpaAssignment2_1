package com.udemy.springframework.datajpa.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.udemy.springframework.datajpa.app.domain.Publisher;


public interface PublisherRepository extends CrudRepository<Publisher, Long>{

}
