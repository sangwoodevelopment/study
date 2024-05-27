package generic;

public class GenericPrinterExtendsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluminum al = new Aluminum();
		GenericPrinterExtends<Aluminum> printer1 = new GenericPrinterExtends<>();
		printer1.setMaterial(al);
		System.out.println(printer1.getMaterial());
		Aluminum p = printer1.getMaterial();
		System.out.println(p);
		
		System.out.println("==============================");
		Plastic plastic = new Plastic();
		GenericPrinterExtends<Plastic> printer2 = new GenericPrinterExtends<>();
		printer2.setMaterial(plastic);
		System.out.println(printer2.getMaterial());
		Plastic p2 = printer2.getMaterial();
		System.out.println(p2);
		
		GenericPrinterExtends<Coffee> printer3 = new GenericPrinterExtends<>();
	}

}
