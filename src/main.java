public class main {
	public static void main(String[] args) {
		Human malish = new Human("Малыш");
		HumanWthPropeller karlson = new HumanWthPropeller("Карлсон");
		Moneybox moneybox = new Moneybox();

		malish.say("Привет");
		karlson.say("Даров");

		for(int i = 0; i < 3; ++ i){
			moneybox.addCoin(Coin.ER5);
			moneybox.addCoin(Coin.ER25);
			moneybox.addCoin(Coin.ER10);
		}

		malish.takeMoneybox(moneybox);

		malish.getAllCoinsFromMoneybox();
	}
}
