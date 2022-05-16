package sec11.sec1;

import java.util.Objects;

//DTO(Data Transfer Object)
public class Key {
	private int age;
	private String name;
	private String ssn;
	
	public Key(int age, String name, String ssn) {
		super();
		this.age = age;
		this.name = name;
		this.ssn = ssn;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, ssn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(ssn, other.ssn);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Key [age=").append(age).append(", name=").append(name).append(", ssn=").append(ssn).append("]");
		return builder.toString();
	}	
}
