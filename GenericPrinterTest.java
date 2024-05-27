package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluminum al = new Aluminum();
		GenericPrinter<Aluminum> printer1 = new GenericPrinter<>();
		printer1.setMaterial(al);
		System.out.println(printer1.getMaterial());
		Aluminum p = printer1.getMaterial();
		System.out.println(p);
		
		System.out.println("==============================");
		Plastic plastic = new Plastic();
		GenericPrinter<Plastic> printer2 = new GenericPrinter<>();
		printer2.setMaterial(plastic);
		System.out.println(printer2.getMaterial());
		Plastic p2 = printer2.getMaterial();
		System.out.println(p2);
		
		GenericPrinter<Coffee> printer3 = new GenericPrinter<>();
		
	}

}
