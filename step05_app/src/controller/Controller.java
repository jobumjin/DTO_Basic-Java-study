package controller;

import model.Model;
import view.EndView;

public class Controller {

	public static void reqRes(int flag) {
		if (flag == 1) {
			EndView.print(Model.getProducts());
		} else if (flag == 2) {
			EndView.AllPrint(Model.getProducts());
		} else if (flag == 3) {
			EndView.LessPrint(Model.getProducts());
		} else {
			EndView.MsgPrint("잘못된 요청입니다.");
		}
	}

}