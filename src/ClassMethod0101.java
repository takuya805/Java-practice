
public class ClassMethod0101 {
	public static void main(String[] args) {
		Human0101 yamada = new Human0101();
		System.out.println("名前は"+yamada.name+"で、年齢は"+yamada.age+"です。");

		Human0101 sato = new Human0101("佐藤",25);
		System.out.println("名前は"+sato.name+"で、年齢は"+sato.age+"です。");
	}

}
