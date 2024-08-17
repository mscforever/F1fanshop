package edu.shop.f1fan.dao;

import java.util.List;

import edu.shop.f1fan.entity.Good;

public interface GoodDao {

	public void addGood(Good good) throws DaoException;

	public List<Good> findGoodByType(String type) throws DaoException;

	public List<Good> findGoodByTeam(String team) throws DaoException;

	public List<Good> findGoodBySize(int size) throws DaoException;

	public List<Good> findGoodByPrice(double price) throws DaoException;

	public List<Good> allGoods(List<Good> goods) throws DaoException;

	public void deleteGoodByType(String type) throws DaoException;

}