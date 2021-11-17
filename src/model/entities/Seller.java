package model.entities;

import java.util.Date;
import java.util.Objects;

public class Seller {

	private Integer id;

	private String name;

	private String email;

	private Date birthdate;

	private Double basesalary;

	private Department department;

	public Seller() {
	}

	public Seller(Integer id, String name, String email, Date birthdate, Double basesalary, Department department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthdate = birthdate;
		this.basesalary = basesalary;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Double getBasesalary() {
		return basesalary;
	}

	public void setBasesalary(Double basesalary) {
		this.basesalary = basesalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(id);
		sb.append("   ");
		sb.append(name);
		sb.append("   ");
		sb.append(email);
		sb.append("   ");
		sb.append(birthdate);
		sb.append("   ");
		sb.append(basesalary);
		sb.append("   ");
		sb.append(department);
		return sb.toString();
	}

}
