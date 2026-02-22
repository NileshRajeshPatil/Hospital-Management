package com.SpringBoot.project.hospitalManagement.repository;

import com.SpringBoot.project.hospitalManagement.entity.User;
import com.SpringBoot.project.hospitalManagement.entity.type.AuthProviderType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    Optional<User> findByProviderIdAndProviderType(String providerId, AuthProviderType providerType);
}