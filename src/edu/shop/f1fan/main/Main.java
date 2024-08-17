package edu.shop.f1fan.main;

import edu.shop.f1fan.controller.Controller;

public class Main {

	public static void main(String[] args) {
		Controller ctrl = new Controller();

		String request;
		String response;

// 		request = "ADD\ntype=Shirt\nteam=Ferrari\nprice=100\nsize=52";
// 		System.out.println(response = ctrl.doAction(request));

//		request = "ADD\ntype=Shirt\nteam=Mercedes\nprice=199.99\nsize=44";
//		System.out.println(response = ctrl.doAction(request));

//		request = "ADD\ntype=Cap\nteam=McLaren\nprice=200.00\nsize=46";
//		System.out.println(response = ctrl.doAction(request));
		
//		request = "ADD\ntype=Shirt\nteam=Ferrari\nprice=300.00\nsize=48";
//		System.out.println(response = ctrl.doAction(request));
		
//		request = "ADD\ntype=Cap\nteam=Ferrari\nprice=400.00\nsize=50";	
//		System.out.println(response = ctrl.doAction(request));

//		request = "ADD\ntype=Jacket\nteam=Mercedes\nprice=400.00\nsize=48";
//		System.out.println(response = ctrl.doAction(request));

//		request = "ADD\ntype=Jacket\nteam=McLaren\nprice=400.00\nsize=44";
//		System.out.println(response = ctrl.doAction(request));
		
//		request = "ADD\ntype=Shirt\nteam=McLaren\nprice=100.00\nsize=46";
//		System.out.println(response = ctrl.doAction(request));

//		request = "FIND_SIZE\nsize=1";
//		response = ctrl.doAction(request);
//		System.out.println(response);

		
		  request = "FIND_TEAM\nteam=Ferrari"; response = ctrl.doAction(request);
		  System.out.println(response);
		  
		  request = "FIND_TYPE\ntype=Shirt"; response = ctrl.doAction(request);
		  System.out.println(response);
		  
		  request = "FIND_PRICE\nprice=100"; response = ctrl.doAction(request);
		  System.out.println(response);
		 
//		request = "DELETE_TYPE\ntype=Shirt";
//		response = ctrl.doAction(request);
//		System.out.println(response);

	}

}