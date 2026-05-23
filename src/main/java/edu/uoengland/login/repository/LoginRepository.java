package edu.uoengland.login.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.uoengland.login.entity.Users;

@Repository
public interface LoginRepository extends JpaRepository<Users, UUID>{

	Optional<Users> findByEmailAddress(String email);
}
