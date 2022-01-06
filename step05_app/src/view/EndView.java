package view;

import model.ProductDTO;

public class EndView {

	public static void print(ProductDTO[] p) {
		for (ProductDTO v : p) {
			if (v.getName().equals("»ï°¢±è¹ä")) {
				System.out.println(v);
			}
		}
	}

	public static void AllPrint(ProductDTO[] all) {
		for (ProductDTO p : all) {
			System.out.println(p);
		}
	}

	public static void LessPrint(ProductDTO[] less) {
		for (ProductDTO p : less) {
			if (p.getQuantity() < 10) {
				System.out.println(p);
			}
		}
	}

	public static void MsgPrint(String msg) {
		System.out.println(msg);
	}
}