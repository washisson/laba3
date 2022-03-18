import java.util.ArrayList;

public interface AbleToUseMoneybox {
	public void takeMoneybox(Moneybox moneybox);
	public Coin getCoinFromMoneybox();
	public ArrayList<Coin> getAllCoinsFromMoneybox();
	public void addCoinToMoneybox(Coin coin);
}
