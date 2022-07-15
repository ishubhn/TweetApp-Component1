package com.tweetapp.service;

import com.tweetapp.entity.Tweet;
import com.tweetapp.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetService {
    @Autowired
    private TweetRepository repo;

    public void createTweet(Tweet tweet) {
        repo.save(tweet);
    }

    public List<Tweet> getAllTweets() {
        List<Tweet> list = repo.findAll();
        return list;
    }

    // Not sure if it will work
    public Tweet getTweetByUserId(String emailID) {
        Tweet byEmailId = repo.findByEmailId(emailID);
        return byEmailId;
    }
}
