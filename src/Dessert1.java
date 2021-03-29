
public enum Dessert1 {

	 APPLE(100), ICE_CREAM(200), CAKE(300),;

	  // 値段を保持するフィールド
	    private int price;

	  // コンストラクタを追加。引数はint型の値段。
	    private Dessert1(int price) {
	        this.price = price;
	    }

	  // 値段を取得するメソッドを追加
	    public int getPrice() {
	        return price;
	    }
}
