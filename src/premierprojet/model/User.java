package premierprojet.model;

import java.util.Objects;

public class User {
	private String name;
	private int age;

	public User() {
	}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + this.name + ", age=" + this.age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.age, this.name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ((obj == null) || (this.getClass() != obj.getClass())) {
			return false;
		}
		User other = (User) obj;
		return this.age == other.age && Objects.equals(this.name, other.name);
	}

}
