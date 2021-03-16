package classMethod.human;

public class Human0301 {
	public String name;
	public int age;
	public String profesion;

	public Human0301() {
		this.name = "山田";
		this.age = 20;
		this.profesion = "プログラマー";
	}

	public String getProfile() {
		return "年齢は"+this.name+"、職業は"+this.profesion;
	}

	public void greet(String friend) {
		if(friend==null) {
			System.out.println("挨拶する友達がわかりません！");
			return;
		}
		System.out.println(friend +"さん、こんにちは！");
	}

}
