public class DecoratorPatternTest {

	public static void main(String[] args) {
		Cafe latte = new Latte(new Mocha());
		latte.combinar();
		System.out.println("\n*****");
		
		Cafe MochaLateCrema = new Latte(new Crema(new Mocha()));
		MochaLateCrema.combinar();
	}

}