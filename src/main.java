public class main {
	public static void main(String[] args) {
		int [] a = {1, 2, 3};
		Moneybox m1 = new Moneybox(a);
		m1.setUser(new Human());

		while (!m1.empty()){
			m1.getCoin();
		}
		System.out.println("Help!!!");
	}
}
