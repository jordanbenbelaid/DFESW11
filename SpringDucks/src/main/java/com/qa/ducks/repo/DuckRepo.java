package com.qa.ducks.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.ducks.entity.Duck;

@Repository
public interface DuckRepo extends JpaRepository<Duck, Long>{

}
