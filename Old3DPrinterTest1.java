package generic;

public class Old3DPrinterTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluminum aluminum = new Aluminum();
		OldThreeDPrinter1 printer = new OldThreeDPrinter1();
		printer.setMaterial(aluminum);
		
		Aluminum al = (Aluminum) printer.getMaterial();

	}

}
