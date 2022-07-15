package com.tweetapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Tweet {
    @Id
    @GeneratedValue
    private long id;
    private String emailId;
    private String message;
    private int likes;
    private Date dateOfTweet;

    public Tweet (String emailId, String message, int likes) {
        this.emailId = emailId;
        this.message = message;
        this.likes = likes;
        dateOfTweet = new Date();
    }
}
