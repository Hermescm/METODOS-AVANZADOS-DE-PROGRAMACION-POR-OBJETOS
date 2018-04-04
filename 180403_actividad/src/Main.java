
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		CatDogAdapter adapter = new CatDogAdapter(cat);
		Turkey pollito = new Turkey();
		TurkeyDogAdapter p = new TurkeyDogAdapter(pollito);
		
		p.bite();
		adapter.bark();
		
	}

}