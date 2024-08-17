package edu.shop.f1fan.logic;

import java.util.List;

import edu.shop.f1fan.entity.Good;


	public interface GoodLogic {

		public void addGood(Good good) throws LogicException;

		public List<Good> findGoodByType(String type) throws LogicException;

		public List<Good> findGoodByTeam(String team) throws LogicException;

		public List<Good> findGoodBySize(int size) throws LogicException;

		public List<Good> findGoodByPrice(double price) throws LogicException;

		public List<Good> allGoods(List<Good> goods) throws LogicException;

		public void deleteGoodByType(String type) throws LogicException;

	}