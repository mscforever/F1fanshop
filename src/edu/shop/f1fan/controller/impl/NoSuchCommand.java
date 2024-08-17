package edu.shop.f1fan.controller.impl;

import edu.shop.f1fan.controller.Command;

	public class NoSuchCommand implements Command {

		@Override
		public String execute(String request) {
			return "Ошибка запроса";
		}

	}