package com.greenfoxacademy.restday01.repository;

import com.greenfoxacademy.restday01.models.Entries;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestLogRepository extends CrudRepository<Entries, Long> {

}
