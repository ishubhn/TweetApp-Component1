package com.tweetapp.repository;

import com.tweetapp.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
//    Optional<UserEntity> findById(String emailId);

}
