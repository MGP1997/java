package sub02;

public class User1Vo {
	private String user_id;
	private String user_name;
	private String user_hp;
	private int age;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_hp() {
		return user_hp;
	}

	public void setUser_hp(String user_hp) {
		this.user_hp = user_hp;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "USER1 [user_id=" + user_id + ", user_name=" + user_name + ", user_hp=" + user_hp + ", age=" + age + "]";
	}
}
