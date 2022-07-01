package mydemo.hiber.StudentManageHiber.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="Address")
public class Address {
	@Id
	private int houseno;
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	private String city;
	private String state;
	private String country;

}
