import java.util.ArrayList;
import java.util.Objects;

public class Human extends Humanoid implements AbleToUseMoneybox {
	private Moneybox moneybox;

	public Human(){
		this("NoName");
	}
	public Human(String name){
		this.name = name;
	}

	@Override
	public void takeMoneybox(Moneybox moneybox) {
		this.moneybox = moneybox;
	}

	@Override
	public Coin getCoinFromMoneybox() {
		Coin coin = moneybox.getCoin();
		say("Я достал монету " + coin);
		return coin;
	}

	@Override
	public ArrayList<Coin> getAllCoinsFromMoneybox() {
		ArrayList<Coin> coins = new ArrayList<>();

		while (!moneybox.empty()){
			coins.add(getCoinFromMoneybox());
		}
		return coins;
	}

	@Override
	public void addCoinToMoneybox(Coin coin) {
		moneybox.addCoin(coin);
	}

	@Override
	public String toString() {
		return "Человек " + name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Human human = (Human) o;
		return Objects.equals(moneybox, human.moneybox);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), moneybox);
	}
}
