public enum Coin {
	ER5 (0, "5 эре"),
	ER10 (1, "10 эре"),
	ER25 (2, "15 эре");

	private int id;
	private String name;
	public final static int MAX_ID = 2;

	static public Coin detectCoinOnTheID(int id){
		if(id == 0)
			return  ER5;
		if(id == 1)
			return ER10;
		if(id == 2)
			return ER25;
		return null;
	}

	Coin(int i, String s) {
		id = i;
		name = s;
	}

	String getName(){
		return name;
	}

	int getId(){
		return id;
	}
}
