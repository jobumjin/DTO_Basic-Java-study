package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ProductDTO {

	private String name;
	private int price;
	private int quantity;
	private String barcord;

	public void setPrice(int price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("잘못된 가격");
		}
	}

	public void setQuantity(int quantity) {
		if (quantity > 0) {
			this.quantity = quantity;
		} else {
			System.out.println("잘못 된 수량");
		}
	}

	public void setBarcord(String barcord) {
		if (barcord.length() == 8) {
			this.barcord = barcord;
		} else {
			System.out.println("잘못 된 바코드");
		}
	}
}