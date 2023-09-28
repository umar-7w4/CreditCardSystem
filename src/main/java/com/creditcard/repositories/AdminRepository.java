package com.creditcard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.creditcard.entities.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
	@Query("select obj from Admin obj where obj.userName=?1 and obj.password=?2")

	Admin validateLogin(String userName, String password);

}
 