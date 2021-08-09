package generics;

public class ThreeDPrinter<T extends Material> {   //���ʸ� Ŭ���� type�� ���� T
	private T material;

	public T getMaterial() {   //��ȯ���� object
		return material;
	}

	public void setMaterial(T material) {   //�Ű����� �ڷ����� object
		this.material = material;
		
		
	}

	@Override
	public String toString() {
		return material.toString();
	}
	public void Printing() {
		material.doPrinting();
	}
	
}
