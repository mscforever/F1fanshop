package edu.shop.f1fan.logic;

import edu.shop.f1fan.logic.impl.GoodLogicImpl;

public final class GoodLogicProvider {

	private static final GoodLogicProvider instance = new GoodLogicProvider();

	private GoodLogicProvider() {}

	private GoodLogic logic = new GoodLogicImpl();

	public GoodLogic getGoodLogic() {
		return logic;
	}

	public static GoodLogicProvider getInstance() {
		return instance;
	}

}
