package com.Subha.ineuron.q22.Q22.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.Subha.ineuron.q22.Q22.Entity.User;

@Component
public interface UserRepo extends JpaRepository<User,Integer>{

	public List<User> findAll();
	
}
