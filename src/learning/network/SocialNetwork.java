package learning.network;

import java.time.Instant;
import java.util.Date;

public class SocialNetwork {

	public static void main(String[] args) {
				
		String title = "Traveling to New Zeland";
		String content = "Im going to visit this wonderful country!";
		int likes = 12;
		
		Date date = Date.from(Instant.parse("2018-06-21T13:05:44Z"));
		
		Post post = new Post(title, content, date, likes);
		Comment[] comment = new Comment[2];;
		comment[0] = new Comment("Have a nice trip");
		comment[1] = new Comment("Wow that's awesome!");

		for(Comment c : comment) {
			post.addComment(c);
		}
		
		System.out.println(post);
		
		post.getComments();
		
		title = "Good night guys";
		content = "See you tomorrow";
		likes = 5;
		
		date = Date.from(Instant.parse("2018-07-28T23:15:19Z"));
		
		post = new Post(title, content, date, likes);
		comment[0] = new Comment("Good Night");
		comment[1] = new Comment("May the Force be with you");
		
		for(Comment c : comment) {
			post.addComment(c);
		}
		
		System.out.println(post);
		
		post.getComments();

	}
}
