package gss.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CollectionId;

@Entity
@Table(name = "registration")
public class Registration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@NotEmpty(message = "NAME CAN'T BE NULL")
	@Column(name = "name")
	private String name;
	
	//@Size(min = 1,message = "AGE CAN'T BE ZERO")
	@Column(name = "age")
	private int age;
	
	@NotEmpty(message = "PHONE NUMBER CAN'T BE NULL")
	@Size(max = 10,min = 10,message = "PLEASE ENTER 10 DIGIT VALID NUMBER")
	@Pattern(regexp = "(^$|[0-9]{10})",message = "PLEASE ENTER 10 DIGIT MOBILE NUMBER")
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Email(message = "PLEASE ENTER A VALID MAIL ADDRESS")
	@Column(name = "email")
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Registration [id=" + id + ", name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + "]";
	}
	
}
