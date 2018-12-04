package com.nithin.spring.app.ws.ui.model.response;

/**
 * A Java class which will be used by the framework to create JSON pay load
 * which will be sent back as a response to a calling client (For Ex. A mobile
 * application). This will contain some additional details confirming that the
 * user details have been stored in the database.
 * 
 * @author Nithin
 *
 */
public class UserRest {

	private String userId;
	private String firstName;
	private String lastName;
	private String email;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserRest [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}

}