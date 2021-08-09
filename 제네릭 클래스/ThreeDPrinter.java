package generics;

public class ThreeDPrinter<T extends Material> {   //제너릭 클래스 type의 약자 T
	private T material;

	public T getMaterial() {   //반환형이 object
		return material;
	}

	public void setMaterial(T material) {   //매개변수 자료형이 object
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
