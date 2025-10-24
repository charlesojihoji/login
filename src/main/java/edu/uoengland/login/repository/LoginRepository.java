package edu.uoengland.login.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.uoengland.login.entity.Consumer;

@Repository
public interface LoginRepository extends JpaRepository<Consumer, UUID>{

	Optional<Consumer> findByEmailAddress(String email);
}
