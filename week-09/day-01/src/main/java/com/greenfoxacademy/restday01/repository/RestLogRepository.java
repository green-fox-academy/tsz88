package com.greenfoxacademy.restday01.repository;

import com.greenfoxacademy.restday01.models.Entities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestLogRepository extends CrudRepository<Entities, Long> {

}
