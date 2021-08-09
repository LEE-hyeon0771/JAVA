package generics;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();  //������ type(Ŭ����)�� ����.
		printer.setMaterial(new Powder());
		Powder powder = (Powder)printer.getMaterial();
		System.out.println(printer);
		
		ThreeDPrinter<Plastic> printerPlastic = new ThreeDPrinter<Plastic>();  //������ type(Ŭ����)�� ����.
		printerPlastic.setMaterial(new Plastic());
		Plastic plastic = (Plastic)printerPlastic.getMaterial();
		System.out.println(printerPlastic);
		
		printerPlastic.Printing();
		printer.Printing();
	}

}
