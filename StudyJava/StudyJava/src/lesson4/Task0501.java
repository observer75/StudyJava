package lesson4;

public class Task0501 {
	
	public static void main(String[] args) {
		double a = 45.764;
		double b = 23.456;
		//double c;
		Calculator Casio = new Calculator(a, b);
		//c = Casio.plus();
		System.out.println(Casio.plus());
		System.out.println(Casio.minus());
		System.out.println(Casio.multiply());
		System.out.println(Casio.divide());
		//System.out.println("OK");
	}
}
