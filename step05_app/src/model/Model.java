package model;

public class Model {

	public static ProductDTO[] getProducts() {

		ProductDTO[] p = { new ProductDTO("�ﰢ���", 1000, 5, "10047871"), 
							new ProductDTO("������ġ", 2000, 10, "648178711"),
							new ProductDTO("�ݶ�", 1500, 200, "12378711"), 
							new ProductDTO("�����", 1700, 15, "64817655"),
							new ProductDTO("����", 1200, 35, "64815711") };

		return p;
	}
}

//builder ��.. ���� ���°� �������??