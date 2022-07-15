package com.tweetapp.repository;

import com.tweetapp.entity.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
    Tweet findByEmailId(String emailID);
}
