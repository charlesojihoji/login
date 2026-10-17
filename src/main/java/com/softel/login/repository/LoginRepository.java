package com.softel.login.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softel.login.entity.Users;

@Repository
public interface LoginRepository extends JpaRepository<Users, UUID>{

	Optional<Users> findByEmailAddress(String email);
}
