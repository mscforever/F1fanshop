package edu.shop.f1fan.dao.impl;


	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.nio.file.Files;
	import java.nio.file.Paths;
	import java.util.ArrayList;
	import java.util.List;

	import edu.shop.f1fan.dao.GoodDao;
	import edu.shop.f1fan.dao.DaoException;
	import edu.shop.f1fan.entity.Good;

	public class FileGoodDao implements GoodDao {

		private static final String FILE_NAME = "resources\\good.txt";

		@Override
		public void addGood(Good good) throws DaoException {
			PrintWriter writer = null;
			try {
				writer = new PrintWriter(new FileWriter(FILE_NAME, true));
				writer.println(convertGoodToString(good));
			} catch (IOException e) {
				throw new DaoException(e);
			} finally {
				if (writer != null) {
					writer.close();
				}
			}
		}

		@Override
		public void deleteGoodByType(String type) throws DaoException {
			try {

				List<String> goods = Files.readAllLines(Paths.get(FILE_NAME));
				List<String> updatedLines = new ArrayList<>();

				for (String line : goods) {
					if (!line.contains(type)) {
						updatedLines.add(line);
					}
				}

				Files.write(Paths.get(FILE_NAME), updatedLines);
			} catch (IOException e) {
				throw new DaoException(e);
			}
		}

		@Override
		public List<Good> findGoodByType(String type) throws DaoException {

			List<Good> matchingGoods = new ArrayList<>();
			List<Good> allGoods = getAllGoods();

			for (Good good : allGoods) {
				if (good.getType().equalsIgnoreCase(type)) {
					matchingGoods.add(good);
				}
			}
			return matchingGoods;
		}

		@Override
		public List<Good> findGoodByTeam(String team) throws DaoException {

			List<Good> matchingGoods = new ArrayList<>();
			List<Good> allGoods = getAllGoods();

			for (Good good : allGoods) {
				if (good.getTeam().equalsIgnoreCase(team)) {
					matchingGoods.add(good);
				}
			}
			return matchingGoods;
		}

		@Override
		public List<Good> findGoodBySize(int size) throws DaoException {
			
			List<Good> matchingGoods = new ArrayList<>();
			List<Good> allGoods = getAllGoods();

			for (Good good : allGoods) {
				if (good.getSize() == size) {
					matchingGoods.add(good);
				}
			}
			return matchingGoods;
		}

		@Override
		public List<Good> findGoodByPrice(double price) throws DaoException {
			
			List<Good> matchingGoods = new ArrayList<>();
			List<Good> allGoods = getAllGoods();

			for (Good good : allGoods) {
				if (good.getPrice() == price) {
					matchingGoods.add(good);
				}
			}
			return matchingGoods;
		}

		@Override
		public List<Good> allGoods(List<Good> goods) throws DaoException {
			
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
				
				for (Good good : goods) {
					writer.write(convertGoodToString(good));
					writer.newLine();
				}
			} catch (IOException e) {
				throw new DaoException(e);
			}
			return goods;
		}

		private List<Good> getAllGoods() throws DaoException {
			List<Good> goods = new ArrayList<>();
			try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
				String line;
				while ((line = reader.readLine()) != null) {
					goods.add(convertStringToGood(line));
				}
			} catch (IOException e) {
				throw new DaoException(e);
			}
			return goods;
		}

		private String convertGoodToString(Good good) {
			return good.getType() + "," + good.getTeam() + "," + good.getPrice() + "," + good.getSize();
		}

		private Good convertStringToGood(String line) {
			String[] parts = line.split(",");
			return new Good(parts[0], parts[1], Double.parseDouble(parts[2]), Integer.parseInt(parts[3]));
		}
	}

