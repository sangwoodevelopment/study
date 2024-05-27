package generic;
//타입이 들어가야 하는 부분에 모두 T라고 표시한다
//T는 타입파라미터를 의미
public class GenericPrinterExtends<T extends Material> {
	private T material;
	
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}


	
}
