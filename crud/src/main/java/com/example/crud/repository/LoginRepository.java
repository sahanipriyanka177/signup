 package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.entity.login;

@Repository
public interface LoginRepository extends JpaRepository<login,String> {
	
	

}
