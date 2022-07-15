package com.tweetapp;

import com.tweetapp.entity.Tweet;
import com.tweetapp.entity.UserEntity;
import com.tweetapp.service.TweetService;
import com.tweetapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class TweetappApplication implements CommandLineRunner {
	@Autowired
	UserService repo;

	@Autowired
	TweetService tweetRepo;
//	UserRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(TweetappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repo.createUser(new UserEntity("shubham@123.io", "shubham", "Nagre", "password",
				"9999911112", true));

		repo.createUser(new UserEntity("jaydatt@123.io", "gaurav", "wanjari", "password123",
				"9122311111", false));

//		UserEntity user = repo.findUserById("shubham@123.io");
//		List<UserEntity> list = repo.findAllUsers();
//		list.forEach(user -> System.out.println(user.toString()));

		tweetRepo.createTweet(new Tweet("shubham@123.io", "Hello World", 2));
		tweetRepo.createTweet(new Tweet("jaydatt@123.io", "Bye Bye", 1));
		Tweet tweet = tweetRepo.getTweetByUserId("jaydatt@123.io");
		System.out.println(tweet.toString());
	}
}
