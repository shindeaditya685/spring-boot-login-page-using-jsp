package com.web.springwebapplication.repository;

import com.web.springwebapplication.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByEmail(String email);
}
