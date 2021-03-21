
public class Dessert {

	  // 値段を保持するフィールド
	    private int price;

	  // コンストラクタを追加。引数はint型の値段。
	    private Dessert(int price) {
	        this.price = price;
	    }

	  // 値段を取得するメソッドを追加
	    public int getPrice() {
	        return price;
	    }

}
