package edu.shop.f1fan.logic.impl;

import java.util.List;
import edu.shop.f1fan.dao.GoodDao;
import edu.shop.f1fan.dao.DaoException;
import edu.shop.f1fan.dao.DaoProvider;
import edu.shop.f1fan.entity.Good;
import edu.shop.f1fan.logic.GoodLogic;
import edu.shop.f1fan.logic.LogicException;

public class GoodLogicImpl implements GoodLogic {

		private final GoodDao goodDao = DaoProvider.getInstance().getGoodDao();

		@Override
		public void addGood(Good good) throws LogicException {
			try {
				goodDao.addGood(good);
			} catch (DaoException e) {
				throw new LogicException(e);
			}

		}

		@Override
		public void deleteGoodByType(String type) throws LogicException {
			try {
				goodDao.deleteGoodByType(type);
			} catch (DaoException e) {
				throw new LogicException(e);
			}
		}

		@Override
		public List<Good> findGoodByType(String type) throws LogicException {

			try {
				return goodDao.findGoodByType(type);
			} catch (DaoException e) {
				throw new LogicException(e);
			}
		}

		@Override
		public List<Good> findGoodByTeam(String team) throws LogicException {

			try {
				return goodDao.findGoodByTeam(team);
			} catch (DaoException e) {
				throw new LogicException(e);
			}
		}

		@Override
		public List<Good> findGoodBySize(int size) throws LogicException {

			try {
				return goodDao.findGoodBySize(size);
			} catch (DaoException e) {
				throw new LogicException(e);
			}
		}

		public List<Good> findGoodByPrice(double price) throws LogicException {

			try {
				return goodDao.findGoodByPrice(price);
			} catch (DaoException e) {
				throw new LogicException(e);
			}
		}

		@Override
		public List<Good> allGoods(List<Good> goods) throws LogicException {

			try {
				return goodDao.allGoods(goods);
			} catch (DaoException e) {
				throw new LogicException(e);
			}
		}
}