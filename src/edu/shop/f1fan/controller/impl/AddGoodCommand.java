package edu.shop.f1fan.controller.impl;

import edu.shop.f1fan.controller.Command;
import edu.shop.f1fan.entity.Good;
import edu.shop.f1fan.logic.LogicException;
import edu.shop.f1fan.logic.GoodLogicProvider;
import edu.shop.f1fan.logic.GoodLogic;


	public class AddGoodCommand implements Command {
		
		private final GoodLogic logic = GoodLogicProvider.getInstance().getGoodLogic();

		@Override
		public String execute(String request) {
			
			String response;
			String[] params = request.split("\n");
			
			Good newGood;
			newGood = new Good();
			newGood.setType(params[1].split("=")[1]);
			newGood.setTeam(params[2].split("=")[1]);
			newGood.setPrice(Double.parseDouble(params[3].split("=")[1]));
			newGood.setSize(Integer.parseInt(params[4].split("=")[1]));

			try {

				logic.addGood(newGood);
				response = "Товар добавлен.";

			} catch (LogicException e) {

				response = "Не получилось добавить.";
				
			}

			return response;
		}
	}