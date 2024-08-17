package edu.shop.f1fan.dao;

import edu.shop.f1fan.dao.impl.FileGoodDao;

public final class DaoProvider {

	private static final DaoProvider INSTANCE = new DaoProvider();

	private DaoProvider() {
	}

	private GoodDao goodDao = new FileGoodDao();

	public GoodDao getGoodDao() {
		return goodDao;
	}

	public static DaoProvider getInstance() {
		return INSTANCE;
	}

}
