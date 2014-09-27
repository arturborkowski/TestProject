package domain;

import java.util.List;
import java.util.ArrayList;

public class Person {

	private String firstName;
	private String lastName;
	private String pesel;
	
	private User user;
	private List<Adress> adresses;
	
	
	public Person() {
		this.adresses = new ArrayList<Adress>();
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPesel() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Adress> getAdresses() {
		return adresses;
	}
	public void setAdresses(List<Adress> adresses) {
		this.adresses = adresses;
	}
	
	
}
