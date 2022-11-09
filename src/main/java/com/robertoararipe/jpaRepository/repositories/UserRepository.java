package com.robertoararipe.jpaRepository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robertoararipe.jpaRepository.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
