package com.sumit.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class UserAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date birthDate ;
	
	private int pincode ;
	
	private String address;
	
	private String adharCard;
	
	private String city;
	
	private String contact1;
	
	private String contact2;
	
	private String email;
	
	private String firstName;
	
	private String gender;
	
	private String lastName;
	
	private String maratualStatus;
	
	private String middleName;
	
	private String photo;
	
	private String sign;
	
	public  UserAccount() {}

	public UserAccount(int id, Date birthDate, int pincode, String address, String adharCard, String city,
			String contact1, String contact2, String email, String firstName, String gender, String lastName,
			String maratualStatus, String middleName, String photo, String sign) {
		super();
		this.id = id;
		this.birthDate = birthDate;
		this.pincode = pincode;
		this.address = address;
		this.adharCard = adharCard;
		this.city = city;
		this.contact1 = contact1;
		this.contact2 = contact2;
		this.email = email;
		this.firstName = firstName;
		this.gender = gender;
		this.lastName = lastName;
		this.maratualStatus = maratualStatus;
		this.middleName = middleName;
		this.photo = photo;
		this.sign = sign;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(String adharCard) {
		this.adharCard = adharCard;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContact1() {
		return contact1;
	}

	public void setContact1(String contact1) {
		this.contact1 = contact1;
	}

	public String getContact2() {
		return contact2;
	}

	public void setContact2(String contact2) {
		this.contact2 = contact2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMaratualStatus() {
		return maratualStatus;
	}

	public void setMaratualStatus(String maratualStatus) {
		this.maratualStatus = maratualStatus;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	@Override
	public String toString() {
		return "UserAccount [id=" + id + ", birthDate=" + birthDate + ", pincode=" + pincode + ", address=" + address
				+ ", adharCard=" + adharCard + ", city=" + city + ", contact1=" + contact1 + ", contact2=" + contact2
				+ ", email=" + email + ", firstName=" + firstName + ", gender=" + gender + ", lastName=" + lastName
				+ ", maratualStatus=" + maratualStatus + ", middleName=" + middleName + ", photo=" + photo + ", sign="
				+ sign + "]";
	}

	
	
}
