package Interfaceex;

public interface Sell {
	void sell();
	
	default void order() {
		System.out.println("�����ֹ�");
	}
}
