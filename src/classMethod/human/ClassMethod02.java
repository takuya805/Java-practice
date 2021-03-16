package classMethod.human;

import classMethod.human.Human0201;
public class ClassMethod02 {
	public static void main(String[] args) {
		Human0201 yamada = new Human0201();
		System.out.println("名前は"+yamada.name+"で、年齢は"+yamada.age+"です。");

		Human0201 sato = new Human0201("佐藤",25);
		System.out.println("名前は"+sato.name+"で、年齢は"+sato.age+"です。");
	}

}
