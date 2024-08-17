package edu.shop.f1fan.controller.impl;

import java.util.List;

import edu.shop.f1fan.controller.Command;
import edu.shop.f1fan.entity.Good;
import edu.shop.f1fan.logic.GoodLogic;
import edu.shop.f1fan.logic.GoodLogicProvider;
import edu.shop.f1fan.logic.LogicException;

public class FindGoodBySizeCommand implements Command {
	
	private final GoodLogic logic = GoodLogicProvider.getInstance().getGoodLogic();

	@Override
	public String execute(String request) {
		
		String response;
		String[] params = request.split("\n");

		try {
			int size = Integer.parseInt(params[1].split("=")[1]);
			List<Good> good = logic.findGoodBySize(size);
			response = good.toString();
		} catch (LogicException e) {
			response = "Ошибка поиска!";
		}

		return response;
	}
	
}