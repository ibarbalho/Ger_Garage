package com.cct.garageger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cct.garageger.model.User;

//This class represents a generic DAO


public interface UserRepository extends JpaRepository<User, Long>{

}
