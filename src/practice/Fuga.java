package practice;

public class Fuga {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%15==0) {
				System.out.println(i+ ":HogeFuga");
			}else if(i%3==0) {
				System.out.println(i+"Hoge");
			}else if(i%5==0) {
				System.out.println(i+"Fuga");
			}else {
			System.out.println(i);
		}
		}
	}

}
