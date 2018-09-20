package learning.network;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private String title;
	private String content;
	private Date moment;
	private int likes;

	private SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post(String title, String content, Date moment, int likes) {
		this.setTile(title);
		this.setDate(moment);
		this.setContent(content);
		this.setLikes(likes);
	}
	
	public void setTile(String title) {
		this.title = title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setDate(Date moment) {
		this.moment = moment;
	}
	
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
	public String getDate() {
		return date.format(moment);
	}
	
	public int getLikes() {
		return likes;
	}
	
	public void getComments() {
		System.out.println("Comments: ");
		
		for(Comment c : comments) {
			c.toString();
			System.out.println(c.toString());
		}
		
		System.out.println();
	}
	
	public void addComment(Comment comment) {
		this.comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		this.comments.remove(comment);
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%d Likes - %s%n%s", 
				this.getTitle(), this.getLikes(), this.getDate(), this.getContent());
	}
}
