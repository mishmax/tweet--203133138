package model;

import java.util.List;

import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.api.TweetsResources;
import twitter4j.conf.ConfigurationBuilder;




public class twitterinfo {
	
	public List<Status> displayTweets() throws TwitterException
	{
		twitter4j.Twitter twitter = config().getInstance();
		//bean.tweet_bean b_obj = new bean.tweet_bean();
		List<Status> status=twitter.getHomeTimeline();
		for(Status s:status)
		{
			System.out.println(s.getUser().getName()+"                         "+s.getText());
		//b_obj.setUser(s.getUser().getName());
		//b_obj.setMessage(s.getText());
		}
		return status;
	}
	
	public static void main(String[] args) throws TwitterException
	{
		
		
		
		
		//sendTweet("@ADHLecture");
	}
	
	public static Status sendTweet(String text) throws TwitterException
	{
		Status status = null;
		twitter4j.Twitter twitter = config().getInstance();
		
		
		
		status = twitter.updateStatus(text);
		
		System.out.println("successfully updated the status to ["+ status.getText() +"].");
		return status;
	}
	
	public static TwitterFactory config()
	
	{
		ConfigurationBuilder configB = new ConfigurationBuilder();
		configB.setDebugEnabled(true)
		.setOAuthConsumerKey("CLkThbadSewpYIcuCgIvsqXxc")
	    .setOAuthConsumerSecret("8UEejnqaonQXmZQ4yJWGYZL4S9B46QKSJxbE21HWuwSre0ZJOl")
	    .setOAuthAccessToken("1179464772426899457-dMMOLpdNdylbL4sm4ZCye3Gf5FbwOo")
	    .setOAuthAccessTokenSecret("BqwI24EqkzacC6eHs8vdhO0TaxJ8s2PTZqo35Y5be6qVw");
		
		
		
		TwitterFactory tf = new TwitterFactory(configB.build());
		return tf;
	}
	
	

}
