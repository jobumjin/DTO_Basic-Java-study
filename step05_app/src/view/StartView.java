package view;

import controller.Controller;

public class StartView {

	public static void main(String[] args) {

		System.out.println("*** 특정 상품 정보 요청 ***");
		Controller.reqRes(1);

		System.out.println("*** 모든 상품 정보 요청 ***");
		Controller.reqRes(2);

		System.out.println("*** 적은 상품 정보 요청 ***");
		Controller.reqRes(3);

		System.out.println("*** 잘못된 상품 정보 요청 ***");
		Controller.reqRes(4);
	}
}