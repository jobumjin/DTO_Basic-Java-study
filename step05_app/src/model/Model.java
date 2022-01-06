package model;

public class Model {

	public static ProductDTO[] getProducts() {

		ProductDTO[] p = { new ProductDTO("삼각김밥", 1000, 5, "10047871"), 
							new ProductDTO("샌드위치", 2000, 10, "648178711"),
							new ProductDTO("콜라", 1500, 200, "12378711"), 
							new ProductDTO("새우깡", 1700, 15, "64817655"),
							new ProductDTO("가나", 1200, 35, "64815711") };

		return p;
	}
}

//builder 는.. 언제 쓰는게 좋을까요??