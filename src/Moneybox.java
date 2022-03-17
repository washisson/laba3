import java.util.EnumMap;

public class Moneybox {
	private Humanoid user;
	private int [] savedCoins = new int[Coin.MAX_ID + 1];

	public Moneybox(){
		this(new int[Coin.MAX_ID + 1]);
	}
	public Moneybox(int[] args){
		for(int i = 0; i < args.length && i < savedCoins.length; ++ i)
			savedCoins[i] = args[i];
	}

	public void setUser(Humanoid user) {
		this.user = user;
	}

	public  String getUserName(){
		return user.getName();
	}

	public void addCoin(Coin coin){
		savedCoins[coin.getId()] ++;
	}

	public  void addCoin(Coin coin, int amount){
		savedCoins[coin.getId()] += amount;
	}

	public boolean empty(){
		for(int i = 0; i < savedCoins.length; ++ i){
			if(savedCoins[i] > 0)
				return false;
		}
		return true;
	}

	public Coin getCoin(){
		if(!empty()){
			for(int i = 0; i < savedCoins.length; ++ i){
				if(savedCoins[i] > 0){
					savedCoins[i] --;
					System.out.println(getUserName() + " достал монету " + Coin.detectCoinOnTheID(i).getName());
					return Coin.detectCoinOnTheID(i);
				}
			}
		}
		return null;
	}
}
