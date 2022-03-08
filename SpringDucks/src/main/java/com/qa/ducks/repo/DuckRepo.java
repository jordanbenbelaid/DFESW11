package com.qa.ducks.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.ducks.entity.Duck;

public interface DuckRepo extends JpaRepository<Duck, Long>{

}
