package domain;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class Customer {
	private int id;

	@NotEmpty
	@Length(max = 20)
	private String name;

	@NotEmpty
	@Length(max = 100)
	private String address;

	@NotEmpty
	@Email
	private String emailAddress;

	public Customer(String name, String address, String emailAddress) {
		super();
		this.name = name;
		this.address = address;
		this.emailAddress = emailAddress;
	}

	@AssertFalse(message = "{errors.ngemail}")
	public boolean isNgEmail() {
		return emailAddress.matches(".*@ng.foo.baz$");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Customer [id = %s, name = %s, address = %s, emailAddress = %s", id, name, address, emailAddress);
	}
}
