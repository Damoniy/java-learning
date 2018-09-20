package learning.order;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	private String name;
	private String email;
	private Date birthDate;
	
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
	public Client(String name, String email, Date birthDate) {
		this.setName(name);
		this.setEmail(email);
		this.setBirthDate(birthDate);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthDate() {
		return format.format(birthDate);
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
