package edu.shop.f1fan.controller.impl;

import edu.shop.f1fan.controller.Command;
import edu.shop.f1fan.logic.LogicException;
import edu.shop.f1fan.logic.GoodLogicProvider;
import edu.shop.f1fan.logic.GoodLogic;

public class DeleteGoodByTypeCommand implements Command {

	private final GoodLogic logic = GoodLogicProvider.getInstance().getGoodLogic();

	@Override
	public String execute(String request) {

		String response;
		String[] params = request.split("\n");

		try {
			String type = params[1].split("=")[1];
			
			logic.deleteGoodByType(type);
			response = "Товар удален!";
			
		} catch (LogicException e) {
			response = "Ошибка поиска!";
		}
		return response;

	}

}