package com.cct.garageger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cct.garageger.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
