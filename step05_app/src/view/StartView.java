package view;

import controller.Controller;

public class StartView {

	public static void main(String[] args) {

		System.out.println("*** Ư�� ��ǰ ���� ��û ***");
		Controller.reqRes(1);

		System.out.println("*** ��� ��ǰ ���� ��û ***");
		Controller.reqRes(2);

		System.out.println("*** ���� ��ǰ ���� ��û ***");
		Controller.reqRes(3);

		System.out.println("*** �߸��� ��ǰ ���� ��û ***");
		Controller.reqRes(4);
	}
}